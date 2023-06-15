# Concurrency_and_Threads
This is an application that instantiates a 20x20 two-dimensional array of integers, populates it
with random integers drawn from the range of 1 to 100, and then outputs the index of the row
with the highest sum among all the rows. 

To summarize, my application will:

**A.) Generate the two-dimensional array of random integers.<br>
B.) Start 20 concurrent threads, each of which places the sum of one row of the twodimensional array into the corresponding slot of a one-dimensional array.<br>
C.) Output the index of the row with the maximum value.**
