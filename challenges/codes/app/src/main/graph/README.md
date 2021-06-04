# Graphs
<!-- Short summary or background information -->
Grpahs are non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges.


## Challenge
<!-- Description of the challenge -->
Implementing Graph as an adjacency list using an array of linkedlists 

Class Node.java with Generic value, integer weight and a pointer has been created to represent a node

Class LinkedList with generic type created to represent a list of adjecency list

Graph class created to represent graph data strcuture with the following methods:

1. `addNode(T value)` method that add a node to the graph
2. `addEdge<Node<T> n1, Node<T> n2, Integer weigth, boolean isDirected` method that adds weighted edge between two nodes.
3. `getNodes()` methods that gets all the nodes in the graph
4. `getNeighbors(Node<T> node)` methods that gets all the neigbors of a node(connected nodes).
5. `size()` returns the size of the graph
6. `toString()` overrided method that returns the graphs data as string.



## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
add a node -> **O(1)**

get all nodes -> **O(v)** where v is the number of nodes


## API
<!-- Description of each method publicly available in your Graph -->

* create an instance of Graph that holds string data and size of 10

  `Graph<String> graph = new Graph<>(10);`

* create a node and add it to graph

    `Node<String> a = new Node<>("a");`

    `graph.addNode(a.value);`

* add edge between two nodes

    `graph.addEdge(a, b, 4, false);`

* get all neighbors of a node

  `graph.getNeighbors(a);`

* get all graph nodes

  `graph.getNodes();`

* get the graph size

  `graph.size();`

* print out the graph

  `System.out.println(graph);`
