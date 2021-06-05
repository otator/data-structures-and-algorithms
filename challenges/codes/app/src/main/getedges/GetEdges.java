package codes.app.src.main.getedges;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.GraphNode;

import java.util.Set;


public class GetEdges {

  public String getEdges(Graph<String> graph, String[] cityNames){
    StringBuilder result = new StringBuilder();
    boolean found = true;
    Integer cost = 0;
    Set<String> neighbors;
    GraphNode<String> city;
    GraphNode<String> current;
    for(int i=0; i<cityNames.length-1; i++){
      city = new GraphNode<>(cityNames[i]);
      neighbors = graph.getNeighbors(city);
      if(getIndex(graph, city) == -1)
        return null;
      if(neighbors.contains(cityNames[i+1])){
        current = graph.adjList[getIndex(graph, city)].head;
        while (current!= null){
          if (current.value.equals(cityNames[i+1])) {
            cost += current.weight;
            break;
          }
          current = current.next;
        }
      }
      else{
        result.append("False, ").append("$0");
        found = false;
        break;
      }
    }

    if (found)
      result.append("True, $").append(cost);

    return result.toString();
  }

  private int getIndex(Graph<String> graph,GraphNode<String> node){
    for(int i=0; i<graph.size(); i++){
      if (graph.adjList[i].head.equals(node))
        return i;
    }
    return -1;
  }
}
