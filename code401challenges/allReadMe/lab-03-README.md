# Binary Search
Implement Binary Search Algorithm
[Link to code](../src/main/java/code401challenges/BinarySearch.java)

## Challenge
Given an array of integers and value to be searched,
the method implement binary search algorithm to find the index of the search key in the array.
If the element is found, it returns the index of the element otherwise -1.

## Approach & Efficiency
- Created a method named binarySearch 
- Assign 0 as left and end of array as the last index to start with
- Check to see if the middle element is the search key
- If found return the element, otherwise either search in left or right of the array depending on
  whether the middle element is bigger or smaller than the key.
- Reaches the last line and returns -1 indicating the element is not found
- Time complexity and space complexity is O(logn)

## Solution
![](../assets/lab-03.jpg)
