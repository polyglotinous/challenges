package main

import (
  "encoding/csv"
  "os"
  "io"
  "strings"
  "errors"
)

// CsvChannel is a struct that exposes a CSV file as a channel and provides
// some helper methods around it
type CsvChannel struct {
  Channel <-chan []string
  header []string
}

// NewCsvChannel constructs a new instance of CsvChannel
func NewCsvChannel(file *os.File) (*CsvChannel) {
  const autoFieldsPerRecord = 0

  channel := make(chan []string)
  self := CsvChannel{Channel: channel}
  csvReader := csv.NewReader(file)
  csvReader.FieldsPerRecord = autoFieldsPerRecord
  header, _ := csvReader.Read()

  self.header = header

  // Kick off a goroutine that is responsible for writing
  // one row at a time to the channel
  go func () {
    defer close(channel)

    for {
      row, err := csvReader.Read()

      if err != nil {
        if err != io.EOF {
          printError(err)
        }

        return
      }

      channel<- row
    }
  }()

  return &self
}

// Col looks up a column by name and returns its index
func (c *CsvChannel) Col(name string) (int, error) {
  name = strings.ToLower(name)

  for index, current := range c.header {
    if name == strings.ToLower(current) {
      return index, nil
    }
  }

  return -1, errors.New(strings.Join([]string{"Column '", name, "' not found"}, ""))
}