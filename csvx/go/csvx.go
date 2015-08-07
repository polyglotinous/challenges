// TODO: tests
package main

import (
  "encoding/csv"
  "fmt"
  "os"
  "strconv"
  "errors"
  "flag"
)

// This program consumes a CSV on stdin, runs it through a specified set of processors,
// and then prints the result to stdout
func main() {
  csvChan := NewCsvChannel(os.Stdin)
  processors, err :=  processFlags(csvChan)

  if err != nil {
    printError(err)
    return
  }

  printChannel(os.Stdout, chain(csvChan.Channel, processors))
}

// processFlags parses the command line arguments and produces the appropriate chain
// of processors
func processFlags(csvChan *CsvChannel) (processors []csvProcessor, err error) {
  count := flag.String("count", "", "Counts the number of distinct values of the specified column")
  sum := flag.String("sum", "", "Computes the sum and average of the specified column")
  where := flag.String("where", "", "Specifies the column to filter on")
  val := flag.String("val", "", "Specifies the value to filter by if where is specified")

  flag.Parse()

  lookup := func (colName string, factory csvProcessorFactory) ([]csvProcessor, error) {
    col, err := csvChan.Col(colName)

    if err != nil {
      return nil, err
    }

    return append(processors, factory(col)), nil
  }

  if *where != "" && *val != "" {
    processors, err = lookup(*where, func (col int) csvProcessor { return filter(col, *val) })
  } else if *where != "" {
    err = errors.New("The where option requires the val option")
  } else if *val != "" {
    err = errors.New("The val option requires the where option")
  }

  if err != nil {
    return nil, err
  }

  if *count != "" {
    processors, err = lookup(*count, calcCount)
  } else if *sum != "" {
    processors, err = lookup(*sum, calcSum)
  }

  return processors, err
}

// printError prints the specified error and sets the application exit code
func printError(err error) {
  fmt.Println(os.Stderr, err)
  flag.PrintDefaults()
  os.Exit(1)
}

// csvProcessorFactory is a function that returns a csvProcessor
type csvProcessorFactory func(col int) csvProcessor

// csvProcessor is a function that processes incoming csv records and writes them to
// an outbound channel
type csvProcessor func(chanIn <-chan []string, chanOut chan<- []string)

// chain takes an inbound set of reords and runs them through an array of
// csvProcessors
func chain(chanIn <-chan []string, processors []csvProcessor) (<-chan []string) {
  for _, fn := range processors {
    chanOut := make(chan []string)

    go func (fn csvProcessor, chanIn <-chan []string, chanOut chan<- []string) {
      defer close(chanOut)
      fn(chanIn, chanOut)
    }(fn, chanIn, chanOut)

    chanIn = chanOut
  }

  return chanIn
}

// printChannel prints the specified channel as CSV
func printChannel(file *os.File, chanIn <-chan []string) {
  writer := csv.NewWriter(file)

  for row := range chanIn {
    writer.Write(row)
  }

  writer.Flush()
}

// filter removes any rows whose specified column does not match the specified value
func filter(col int, val string) csvProcessor {
  return func (chanIn <-chan []string, chanOut chan<- []string) {
    for row := range chanIn {
      if row[col] == val {
        chanOut <- row
      }
    }
  }
}

// calcSum computes the sum and average for the specified column
func calcSum(col int) csvProcessor {
  return func (chanIn <-chan []string, chanOut chan <- []string) {
    var accum float64 = 0
    var count float64 = 0

    for row := range chanIn {
      val, err := strconv.ParseFloat(row[col], 64)

      if err == nil {
        count += 1
        accum += val
      }
    }

    chanOut <- []string{strconv.FormatFloat(accum, 'f', 2, 64), strconv.FormatFloat(accum / count, 'f', 2, 64)}
  }
}

// calcCount computes a count for each distinct value of the specified column
func calcCount(col int) csvProcessor {
  return func (chanIn <-chan []string, chanOut chan <- []string) {
    m := make(map[string]int64)

    for row := range chanIn {
      val := row[col]

      accum, ok := m[val]

      if ok {
        m[val] = accum + 1
      } else {
        m[val] = 1
      }
    }

    for key, val := range m {
      chanOut <- []string{key, strconv.FormatInt(val, 10)}
    }
  }
}
