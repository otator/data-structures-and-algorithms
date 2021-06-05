package codes.app.src.main.graph;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Graph<T>{
  public LinkedList<T>[] adjList;
  private int index;
  private int size;

  public Graph(int size){
    index = 0;
    this.size = size;
    adjList = new LinkedList[size];
    for(int i=0; i<size; i++)
      adjList[i] = new LinkedList<T>();
  }

  public GraphNode<T> addNode(T value) {
    GraphNode<T> node = new GraphNode<>(value);
    if(index > size)
      return null;
    adjList[index].head = node;
    index+= 1;
    return node;
  }

  public void addEdge(GraphNode<T> node1, GraphNode<T> node2, Integer weight, boolean isDirect){
    if(isDirect){
      addEdgeNode(node1, node1, weight);
    }else{
      addEdgeNode(node1, node2, weight);
      addEdgeNode(node2, node1, weight);
    }

  }

  public Set<T> getNodes(){
    Set<T> allNodes = new HashSet<>();
    GraphNode<T> current;
    for(int i=0; i<index; i++){
      current = adjList[i].head;
      while(current!= null) {
        allNodes.add(current.value);
        current = current.next;
      }
    }
    return allNodes;
  }

  public ArrayList<GraphNode <T>> getNodesList(){
    ArrayList<GraphNode<T>> nodes = new ArrayList<>();
    GraphNode<T> current;
    for(int i=0; i<index; i++){
      current = adjList[i].head;
      while (current!= null){
        nodes.add(current);
        current = current.next;
      }
    }
    return nodes;
  }

  public Set<T> getNeighbors(GraphNode<T> node){
    Set<T> neighbors = new HashSet<>();
    GraphNode<T> current;
    for(int i=0; i<index; i++){
      if(adjList[i].head.equals(node)){
        current = adjList[i].head.next;
        while (current != null){
          neighbors.add(current.value);
          current = current.next;
        }
        break;
      }
    }
    return neighbors;
  }

  public ArrayList<T> getNeighborsList(GraphNode<T> node){
    ArrayList<T> list = new ArrayList<>();
    GraphNode<T> current;
    for(int i=0; i<index; i++){
      if(adjList[i].head.equals(node)){
        current = adjList[i].head.next;
        while (current != null){
          list.add(current.value);
          current = current.next;
        }
        break;
      }
    }
    return list;
  }


  private void addEdgeNode(GraphNode<T> n1, GraphNode<T> n2, Integer weight){
    for(int i=0; i<index; i++){
      if(adjList[i].head.equals(n1)){
        adjList[i].add(n2.value, weight);
      }
    }
  }

  public int size(){
    return index;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    GraphNode<T> current;
    for(int i=0; i<index; i++){
      current = adjList[i].head.next;
      builder.append("[").append(adjList[i].head.value).append("]: ");
      while (current!= null){
        builder.append("(").append(current.value).append(", ").append(current.weight).append(") -> ");
        current = current.next;
      }
      builder.append("null\n");
    }
    return builder.toString();
  }
}
