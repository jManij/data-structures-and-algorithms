# Singly Linked List
Implementation of Singly Linked list

## Challenge
Create three methods to implement a linked list: insert, includes and toString
Insert method takes any value and adds a new node with that value to the head of the list.
Includes method checks if the passed value exists in the list.
ToString method gives a String version of the list.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- O(1) for insert method since we are only checking the first node and that 
gets pointed by the new node
- O(N) for includes since at worst condition we might have to traverse through the
list to see if the value exists.
- O(N) for toString since we traverse through the list to print out the String version.
