package codes.app.src.main.breadthfirst;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.GraphNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestBreadthFirst {

  @Test
  public void testBreadthFirst1(){
    Graph<String> graph = new Graph<>(6);
    GraphNode<String> pandora = new GraphNode<>("Pandora");
    GraphNode<String> narnia = new GraphNode<>("Narnia");
    GraphNode<String> metroville = new GraphNode<>("Metroville");
    GraphNode<String> arendelle = new GraphNode<>("Arendelle");
    GraphNode<String> manstropolis = new GraphNode<>("Manstropolis");
    GraphNode<String> naboo = new GraphNode<>("Naboo");

    graph.addNode(pandora.value);
    graph.addNode(metroville.value);
    graph.addNode(arendelle.value);
    graph.addNode(manstropolis.value);
    graph.addNode(naboo.value);
    graph.addNode(narnia.value);

    graph.addEdge(naboo, narnia, 0, false);
    graph.addEdge(naboo, manstropolis, 0, false);
    graph.addEdge(manstropolis, arendelle, 0, false);

    graph.addEdge(pandora, arendelle, 0, false);
    graph.addEdge(metroville, arendelle, 0, false);
    graph.addEdge(metroville, manstropolis, 0, false);
    graph.addEdge(metroville, naboo, 0, false);
    graph.addEdge(metroville, narnia, 0, false);


    BreadthFirst<String> breadthFirst = new BreadthFirst<>();
    ArrayList<String> breadthList = breadthFirst.breadthFirst(graph, pandora);
    String expected = "[Pandora, Arendelle, Manstropolis, Metroville, Naboo, Narnia]";
    assertEquals(expected, breadthList.toString());
  }
  @Test
  public void testBreadthFirst2() {
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
    String expected="[A, B, C, E, D, F, G, H, I, K]";
    assertEquals(expected, breadthList.toString());
  }

  @Test
  public void testEmptyGraph(){
    Graph<String> graph = new Graph<>(10);
    // NOTE: this node just created and never added to the graph
    GraphNode<String> A = new GraphNode<>("A");
    BreadthFirst<String> breadthFirst = new BreadthFirst<>();
    ArrayList<String> breadthList = breadthFirst.breadthFirst(graph, A);
    assertNull(breadthList);
  }

  @Test
  public void testOneNodeGraph(){
    Graph<String> graph = new Graph<>(10);

    GraphNode<String> A = new GraphNode<>("A");
    graph.addNode(A.value);
    BreadthFirst<String> breadthFirst = new BreadthFirst<>();
    ArrayList<String> breadthList = breadthFirst.breadthFirst(graph, A);
    String expected = "[A]";
    assertEquals(expected, breadthList.toString());
  }

  @Test
  public void testTwoNodesGraph(){
    Graph<String> graph = new Graph<>(10);

    GraphNode<String> A = new GraphNode<>("A");
    graph.addNode(A.value);
    GraphNode<String> B = new GraphNode<>("B");
    graph.addNode(B.value);
    graph.addEdge(A, B, 0, false);
    BreadthFirst<String> breadthFirst = new BreadthFirst<>();
    ArrayList<String> breadthList = breadthFirst.breadthFirst(graph, A);
    String expected = "[A, B]";
    assertEquals(expected, breadthList.toString());
  }

  @Test
  public void testDisconnectedGraph() {
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
    //E
    graph.addEdge(E, D, 1, false);

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
    String expected="[A, B, C, E, D]";
    assertEquals(expected, breadthList.toString());
  }
}
