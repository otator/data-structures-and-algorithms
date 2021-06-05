package codes.app.src.main.graph;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGraph {

  @Test
  public void testAddNode1(){
    Graph<String> graph = new Graph<>(10);
    Node<String> a = new Node<>("a");
    graph.addNode(a.value);
    int expectedSize = 1; //size of graph
    assertEquals(expectedSize, graph.size());
  }

  @Test
  public void testAddEdge(){
    Graph<String> graph = new Graph<>(10);
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    graph.addNode(a.value);
    graph.addNode(b.value);
    graph.addEdge(a, b, 4, false);
    String expected = "[a]: (b, 4) -> null";
    assertEquals(expected, graph.toString().split("\n")[0]);
  }
  @Test
  public void testGetAllNodes(){
    Graph<String> graph = new Graph<>(10);
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    graph.addNode(a.value);
    graph.addNode(b.value);
    graph.addNode(c.value);
    graph.addNode(d.value);
    Set<String> nodes = graph.getNodes();
    assertTrue(nodes.contains("a") && nodes.contains("b") && nodes.contains("c") &&nodes.contains("d") && nodes.size() == 4);
  }

  @Test
  public void testGetAllNeighbors1(){
    Graph<String> graph = new Graph<>(10);

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    graph.addNode(a.value);
    graph.addNode(b.value);
    graph.addNode(c.value);
    graph.addNode(d.value);
    graph.addEdge(a, b, 4, false);
    graph.addEdge(a, c, 3, false);
    graph.addEdge(a, d, 9, false);
    graph.addEdge(d, c, 6, false);
    graph.addEdge(d, b, 5, false);
    Set<String> nodes = graph.getNeighbors(a);
    int expectedSize = 3;
    assertEquals(expectedSize, nodes.size());
  }

  @Test
  public void testGetAllNeighbors2(){
    Graph<String> graph = new Graph<>(10);

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    graph.addNode(a.value);
    graph.addNode(b.value);
    graph.addNode(c.value);
    graph.addNode(d.value);
    graph.addEdge(a, b, 4, false);
    graph.addEdge(a, c, 3, false);
    graph.addEdge(a, d, 9, false);
    graph.addEdge(d, c, 6, false);
    graph.addEdge(d, b, 5, false);
    Set<String> nodes = graph.getNeighbors(a);
    String expected = "[b, c, d]";
    assertEquals(expected, nodes.toString());
  }

  @Test
  public void testGetAllNeighbors3(){
    Graph<String> graph = new Graph<>(10);

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    graph.addNode(a.value);
    graph.addNode(b.value);
    graph.addNode(c.value);
    graph.addNode(d.value);
    graph.addEdge(a, b, 4, false);
    graph.addEdge(a, c, 3, false);
    graph.addEdge(a, d, 9, false);
    graph.addEdge(d, c, 6, false);
    graph.addEdge(d, b, 5, false);
    String expected = "[a]: (b, 4) -> (c, 3) -> (d, 9) -> null";
    assertEquals(expected, graph.toString().split("\n")[0]);
  }


  @Test
  public void testGraphSize(){
    Graph<String> graph = new Graph<>(10);
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    graph.addNode(a.value);
    graph.addNode(b.value);
    graph.addNode(c.value);
    graph.addNode(d.value);
    int expected = 4;
    assertEquals(expected, graph.size());
  }

  @Test
  public void testOneNodeAndOneEdge(){
    Graph<String> graph = new Graph<>(10);
    Node<String> a = new Node<>("a");
    graph.addNode(a.value);
    graph.addEdge(a,a,1, true);
    String expected = "[a]: (a, 1) -> null";
    assertEquals(expected, graph.toString().split("\n")[0]);
  }

  @Test
  public void testEmptyGraph(){
    Graph<String> graph = new Graph<>(10);
    String expected = "";
    assertEquals(expected, graph.toString());
  }








}
