package codes.app.src.main.DepthFirst;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.GraphNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestDepthFirst {

  @Test
  public void testDepthFirstTraversal1(){
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
    String expected = "[A, B, C, G, D, E, H, F]";
    ArrayList<String> depthFirstList = depthFirst.depthFirst(graph, A);
    assertEquals(expected, depthFirstList.toString());
  }

  @Test
  public void testDepthFirstTraversal2(){
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

    DepthFirst<String> depthFirst = new DepthFirst<>();
    String expected = "[Pandora, Arendelle, Manstropolis, Naboo, Narnia, Metroville]";
    ArrayList<String> depthFirstList = depthFirst.depthFirst(graph, pandora);
    assertEquals(expected, depthFirstList.toString());
  }

  @Test
  public void testDepthFirstTraversalEmptyGraph(){
    Graph<String> graph = new Graph<>(6);
    // Not this node did not added to the graph, the graph still empty
    GraphNode<String> A = new GraphNode<>("A");

    DepthFirst<String> depthFirst = new DepthFirst<>();
    ArrayList<String> depthFirstList = depthFirst.depthFirst(graph, A);
    assertNull(depthFirstList);
  }
}
