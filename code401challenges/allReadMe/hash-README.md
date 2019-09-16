# Hashtables
Implement hash table using Java
<!-- Short summary or background information -->

## Challenge
Implement a Hashtable with the following methods:

- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed. 
- get: takes in the key and returns the value from the table. 
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.
<!-- Description of the challenge -->

## Approach & Efficiency
- Used Linked list for the node
- Used ArrayList for the buckets to hold new nodes
- O(1) lookup
