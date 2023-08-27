# Concurrency and Threads

This application generates a 20x20 two-dimensional array of integers, populates it with random integers ranging from 1 to 100, and then identifies the index of the row with the highest sum among all the rows.

## Features

- **Generate Array:** The program creates a 20x20 two-dimensional array filled with random integers in the range of 1 to 100.

- **Concurrent Processing:** It employs concurrent threading to enhance performance. Each of the 20 threads calculates the sum of a single row and stores it in a corresponding slot of a one-dimensional array.

- **Find Maximum Sum Row:** The application then determines the index of the row with the maximum sum using the data obtained from the concurrent threads.
