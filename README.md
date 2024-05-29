# LSN

Java: **17**

Tools: **Lombok**

# Details

Computational complexity: **O(n)**

By using an iterator, we don't have to worry about searching for pairs in both directions.
LinkedHashSet: It maintains the insertion order of elements during iteration. 
The time complexity for basic operations is almost the same as HashSet, i.e., O(1).
Modern JVMs know how to optimize Integers using auto-boxing, but as I sad below:
**Please ignore the loading function, a real use case would use the file anyway**
