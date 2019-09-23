# Challenge Summary
Implement Graph 

## Challenge Description
Implment Graph data structure and implement following methods:
  ### AddNode()
   - Adds a new node to the graph
   - Takes in the value of that node
   - Returns the added node

  ### AddEdge()
  - Adds a new edge between two nodes in the graph
  - Include the ability to have a “weight”
  - Takes in the two nodes to be connected by the edge
  - Both nodes should already be in the Graph
  
  ### GetNodes()
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
  
  
  ### GetNeighbors()
  - Returns a collection of nodes connected to the given node
  - Takes in a given node
  - Include the weight of the connection in the returned collection
  
  ### Size()
  - Returns the total number of nodes in the graph

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- O(1) for adding node since we are not visiting previous nodes
- O(1) for adding edge since we are not visiting previous nodes and directly adding the edge
- O(1) for getting nodes since we are returning the collection variable that holds all the nodes
- O(1) for size as well.


#Online Resources
https://www.geeksforgeeks.org/graph-and-its-representations/


