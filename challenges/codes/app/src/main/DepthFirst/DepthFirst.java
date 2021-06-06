package codes.app.src.main.DepthFirst;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.GraphNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DepthFirst<T>{

  ArrayList<T> nodes = new ArrayList<>();
  Set<T> visited = new HashSet<>();
  GraphStack<T> depth = new GraphStack<>();
  GraphNode<T> top;

  public ArrayList<T> depthFirst(Graph<T> graph, GraphNode<T> root){
    if (graph.size() == 0)
      return null;

    dfs(graph, root);

    return nodes;
  }

  public void dfs(Graph<T> graph ,GraphNode<T> root){
    depth.push(root);
    visited.add(root.value);
    while(!depth.isEmpty()){
      top = depth.pop();
      if(!nodes.contains(top.value))
          nodes.add(top.value);
      for(T node: graph.getNeighborsList(top)){
        if(!visited.contains(node)){
          visited.add(node);
          depth.push(new GraphNode<>(node));
          dfs(graph, new GraphNode<>(node));
        }
      }
    }
  }

}
