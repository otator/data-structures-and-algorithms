package codes.app.src.main.graph;

public class Main {
  public static void main(String[] args) {
    Graph<String> graph = new Graph<>(10);
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
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
