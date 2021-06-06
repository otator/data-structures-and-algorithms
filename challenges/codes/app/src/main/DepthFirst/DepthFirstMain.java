package codes.app.src.main.DepthFirst;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.GraphNode;

import java.util.ArrayList;

public class DepthFirstMain {
  public static void main(String[] args) {
    Graph<String> graph = new Graph<>(8);
    GraphNode<String> A  = new GraphNode<>("A");
    GraphNode<String> B  = new GraphNode<>("B");
    GraphNode<String> C  = new GraphNode<>("C");
    GraphNode<String> D  = new GraphNode<>("D");
    GraphNode<String> E  = new GraphNode<>("E");
    GraphNode<String> F  = new GraphNode<>("F");
    GraphNode<String> G  = new GraphNode<>("G");
    GraphNode<String> H  = new GraphNode<>("H");
    graph.addNode(A.value);
    graph.addNode(B.value);
    graph.addNode(C.value);
    graph.addNode(D.value);
    graph.addNode(E.value);
    graph.addNode(F.value);
    graph.addNode(G.value);
    graph.addNode(H.value);

    graph.addEdge(A, B, 0, false);
    graph.addEdge(A, D, 0, false);
    graph.addEdge(B, C, 0, false);
    graph.addEdge(B, D, 0, false);
    graph.addEdge(C, G, 0, false);


    graph.addEdge(D, E, 0, false);
    graph.addEdge(D, H, 0, false);
    graph.addEdge(D, F, 0, false);
    graph.addEdge(H, F, 0, false);

    DepthFirst<String> depthFirst = new DepthFirst<>();
    ArrayList<String> depthFirstList = depthFirst.depthFirst(graph, A);
    System.out.println(depthFirstList);
  }
}
