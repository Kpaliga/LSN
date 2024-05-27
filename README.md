# LSN

Java: **17**

Tools: **Lombok**

# Details

Computational complexity: **O(n log n)**

Streams in the distinct() method usually use HashSet anyway.
They also allow us to use parallel() and sorted().
Additionally, they are much more readable.

There are situations in which such a solution would make no sense. (small amount of data)
In addition, we cannot easily control the implementation details using java stream API.
However, if the input is really that huge, the current solution seems fine.

**Please ignore the loading function, a real use case would use the file anyway**
