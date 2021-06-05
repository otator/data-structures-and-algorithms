package codes.app.src.main.breadthfirst;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.GraphNode;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Graph<String> graph = new Graph(10);
    GraphNode<String> A = new GraphNode<>("A");
    GraphNode<String> B = new GraphNode<>("B");
    GraphNode<String> C = new GraphNode<>("C");
    GraphNode<String> D = new GraphNode<>("D");
    GraphNode<String> E = new GraphNode<>("E");
    GraphNode<String> F = new GraphNode<>("F");
    GraphNode<String> G = new GraphNode<>("G");
    GraphNode<String> H = new GraphNode<>("H");
    GraphNode<String> I = new GraphNode<>("I");
    GraphNode<String> K = new GraphNode<>("K");

    graph.addNode(A.value);
    graph.addNode(B.value);
    graph.addNode(C.value);
    graph.addNode(D.value);
    graph.addNode(E.value);
    graph.addNode(F.value);
    graph.addNode(G.value);
    graph.addNode(H.value);
    graph.addNode(I.value);
    graph.addNode(K.value);

    //A
    graph.addEdge(A, B, 1, false);
    graph.addEdge(A, C, 1, false);
    graph.addEdge(A, E, 1, false);
    //B
    graph.addEdge(B, D, 1, false);
    //C
    graph.addEdge(C, F, 1, false);
    //E
    graph.addEdge(E, D, 1, false);
    graph.addEdge(E, G, 1, false);
    graph.addEdge(E, F, 1, false);

    //F
    graph.addEdge(F, H, 1, false);
    graph.addEdge(F, I, 1, false);

    // G
    graph.addEdge(G, H, 1, false);

    // K
    graph.addEdge(K, H, 1, false);
    graph.addEdge(K, I, 1, false);

//    System.out.println(graph);
    BreadthFirst<String> breadthFirst = new BreadthFirst<>();
//    System.out.println(graph.getNeighborsList(A));
    ArrayList<String> breadthList = breadthFirst.breadthFirst(graph, A);
    System.out.println(breadthList);
  }
}
