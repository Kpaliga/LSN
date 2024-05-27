# LSN

Java: **17**

Tools: **Lombok**

# Details

Computational complexity: **O(n)**

In my opinion, the code is a bit tricky, but performance was supposed to be the priority.

We assume that the input can only be integers from 0 to 13.
We count the occurrences of the number n by **writing them into the nth index of the occurrence table.**
Then we realize that after the digit "6" there is no longer a pair of numbers giving the sum "13".
If something other than zero occurs in the place [13 - n] (n = the currently checked number from 0 to 6), 
it means that we should display such a pair that many times.
The number entered in this idex is, after all, the number of occurrences.

**Please ignore the loading function, a real use case would use the file anyway**
