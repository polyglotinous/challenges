# CSVX

Write a program that reads CSV data from stdin, performs some computations, and writes new CSV data
to stdout.

Sample CSV data can be found in the data folder of the polyglot project.

## Arguments

csvx should be able to take the following arguments:

    sum <col-name>
      Sums and averages all values in the specified column

    count <col-name>
      Counts all values in the specified column

    where <col-name>
      Filters rows based on the value of the specified column

    val
      The value to be used in the where filter

## Sample usage

Given a CSV file `users.csv` that looks like this:

    gender,age,numvisits
    male,23,2
    female,30,3
    male,32,1
    female,40,7

You find out how many males and females there are by doing this:

    csvx -count gender < users.csv

Would produce:

    male,2
    female,2

You could find out the average number of visits from males like this:

    csvx -where gender -val male -sum numvisits < users.csv

Would produce a record showing the total and the average:

    3,1.5
