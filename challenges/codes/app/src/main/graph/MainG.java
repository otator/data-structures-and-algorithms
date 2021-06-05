package codes.app.src.main.graph;

public class MainG {
  public static void main(String[] args) {
    Graph<String> graph = new Graph<>(10);
    GraphNode<String> a = new GraphNode("a");
    GraphNode<String> b = new GraphNode("b");
    GraphNode<String> c = new GraphNode("c");
    GraphNode<String> d = new GraphNode("d");
    graph.addNode(a.value);
    graph.addNode(b.value);
    graph.addNode(c.value);
    graph.addNode(d.value);
//    System.out.println(graph.getNodes());
    graph.addEdge(a, b, 4, false);
    graph.addEdge(a, c, 3, false);
    graph.addEdge(a, d, 9, false);

    graph.addEdge(d, c, 6, false);
    graph.addEdge(d, b, 5, false);
    System.out.println(graph);
//
//    System.out.println(graph.getNeighbors(b));
    System.out.println(graph.size());
  }
}
