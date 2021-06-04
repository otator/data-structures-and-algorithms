package codes.app.src.main.graph;


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

  public Node<T> addNode(T value) {
    Node<T> node = new Node<>(value);
    if(index > size)
      return null;
    adjList[index].head = node;
    index+= 1;
    return node;
  }

  public void addEdge(Node<T> node1, Node<T> node2, Integer weight, boolean isDirect){
    if(isDirect){
      addEdgeNode(node1, node1, weight);
    }else{
      addEdgeNode(node1, node2, weight);
      addEdgeNode(node2, node1, weight);
    }

  }

  public Set<T> getNodes(){
    Set<T> allNodes = new HashSet<>();
    Node<T> current;
    for(int i=0; i<index; i++){
      current = adjList[i].head;
      while(current!= null) {
        allNodes.add(current.value);
        current = current.next;
      }
    }
    return allNodes;
  }

  public Set<T> getNeighbors(Node<T> node){
    Set<T> neighbors = new HashSet<>();
    Node<T> current;
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


  private void addEdgeNode(Node<T> n1, Node<T> n2, Integer weight){
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
    Node<T> current;
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
