package codes.app.src.main.breadthfirst;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class BreadthFirst<T>{

  public ArrayList<T> breadthFirst(Graph<T> graph, Node<T> root){
    if (graph.size() == 0)
      return null;
    ArrayList<T> nodes = new ArrayList<>();
    Set<T> visited = new HashSet<>();
    Queue<T> breadth = new Queue<>();
    Node<T> front;
    breadth.enqueue(new Node<T>(root.value));

    visited.add(root.value);
    while(!breadth.isEmpty()){
      front = breadth.dequeue();
      nodes.add(front.value);

      for(int i=0; i<graph.getNeighborsList(front).size(); i++){
        if(!visited.contains(graph.getNeighborsList(front).get(i))){
          visited.add(graph.getNeighborsList(front).get(i));
          breadth.enqueue(new Node<T>(graph.getNeighborsList(front).get(i)));
        }
      }
    }
    return nodes;
  }
}
