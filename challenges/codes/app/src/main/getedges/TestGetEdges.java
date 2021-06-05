package codes.app.src.main.getedges;

import codes.app.src.main.graph.Graph;
import codes.app.src.main.graph.GraphNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGetEdges {

  @Test
  public void testGetEdges1(){
    Graph<String> graph = new Graph<>(6);
    GraphNode<String> pandora = new GraphNode<>("Pandora");
    GraphNode<String> narnia = new GraphNode<>("Narnia");
    GraphNode<String> metroville = new GraphNode<>("Metroville");
    GraphNode<String> arendelle = new GraphNode<>("Arendelle");
    GraphNode<String> monstropolis = new GraphNode<>("Monstropolis");
    GraphNode<String> naboo = new GraphNode<>("Naboo");

    graph.addNode(pandora.value);
    graph.addNode(metroville.value);
    graph.addNode(arendelle.value);
    graph.addNode(monstropolis.value);
    graph.addNode(naboo.value);
    graph.addNode(narnia.value);

    graph.addEdge(naboo, narnia, 250, false);
    graph.addEdge(naboo, monstropolis, 73, false);
    graph.addEdge(monstropolis, arendelle, 42, false);

    graph.addEdge(pandora, arendelle, 150, false);
    graph.addEdge(metroville, arendelle, 99, false);
    graph.addEdge(metroville, monstropolis, 105, false);
    graph.addEdge(metroville, naboo, 26, false);
    graph.addEdge(metroville, narnia, 37, false);
    graph.addEdge(metroville, pandora, 82, false);

    GetEdges getEdges = new GetEdges();
    String[] names = {"Metroville", "Pandora"};
    String expected = "True, $82";
    String result = getEdges.getEdges(graph, names);
    assertEquals(expected, result);
  }
  @Test
  public void testGetEdges2(){
    Graph<String> graph = new Graph<>(6);
    GraphNode<String> pandora = new GraphNode<>("Pandora");
    GraphNode<String> narnia = new GraphNode<>("Narnia");
    GraphNode<String> metroville = new GraphNode<>("Metroville");
    GraphNode<String> arendelle = new GraphNode<>("Arendelle");
    GraphNode<String> monstropolis = new GraphNode<>("Monstropolis");
    GraphNode<String> naboo = new GraphNode<>("Naboo");

    graph.addNode(pandora.value);
    graph.addNode(metroville.value);
    graph.addNode(arendelle.value);
    graph.addNode(monstropolis.value);
    graph.addNode(naboo.value);
    graph.addNode(narnia.value);

    graph.addEdge(naboo, narnia, 250, false);
    graph.addEdge(naboo, monstropolis, 73, false);
    graph.addEdge(monstropolis, arendelle, 42, false);

    graph.addEdge(pandora, arendelle, 150, false);
    graph.addEdge(metroville, arendelle, 99, false);
    graph.addEdge(metroville, monstropolis, 105, false);
    graph.addEdge(metroville, naboo, 26, false);
    graph.addEdge(metroville, narnia, 37, false);
    graph.addEdge(metroville, pandora, 82, false);

    GetEdges getEdges = new GetEdges();
    String[] names = {"Arendelle", "Monstropolis", "Naboo"};
    String expected = "True, $115";
    String result = getEdges.getEdges(graph, names);
    assertEquals(expected, result);
  }
  @Test
  public void testGetEdges3(){
    Graph<String> graph = new Graph<>(6);
    GraphNode<String> pandora = new GraphNode<>("Pandora");
    GraphNode<String> narnia = new GraphNode<>("Narnia");
    GraphNode<String> metroville = new GraphNode<>("Metroville");
    GraphNode<String> arendelle = new GraphNode<>("Arendelle");
    GraphNode<String> monstropolis = new GraphNode<>("Monstropolis");
    GraphNode<String> naboo = new GraphNode<>("Naboo");

    graph.addNode(pandora.value);
    graph.addNode(metroville.value);
    graph.addNode(arendelle.value);
    graph.addNode(monstropolis.value);
    graph.addNode(naboo.value);
    graph.addNode(narnia.value);

    graph.addEdge(naboo, narnia, 250, false);
    graph.addEdge(naboo, monstropolis, 73, false);
    graph.addEdge(monstropolis, arendelle, 42, false);

    graph.addEdge(pandora, arendelle, 150, false);
    graph.addEdge(metroville, arendelle, 99, false);
    graph.addEdge(metroville, monstropolis, 105, false);
    graph.addEdge(metroville, naboo, 26, false);
    graph.addEdge(metroville, narnia, 37, false);
    graph.addEdge(metroville, pandora, 82, false);

    GetEdges getEdges = new GetEdges();
    String[] names = {"Naboo", "Pandora"};
    String expected = "False, $0";
    String result = getEdges.getEdges(graph, names);
    assertEquals(expected, result);
  }
  @Test
  public void testGetEdges4(){
    Graph<String> graph = new Graph<>(6);
    GraphNode<String> pandora = new GraphNode<>("Pandora");
    GraphNode<String> narnia = new GraphNode<>("Narnia");
    GraphNode<String> metroville = new GraphNode<>("Metroville");
    GraphNode<String> arendelle = new GraphNode<>("Arendelle");
    GraphNode<String> monstropolis = new GraphNode<>("Monstropolis");
    GraphNode<String> naboo = new GraphNode<>("Naboo");

    graph.addNode(pandora.value);
    graph.addNode(metroville.value);
    graph.addNode(arendelle.value);
    graph.addNode(monstropolis.value);
    graph.addNode(naboo.value);
    graph.addNode(narnia.value);

    graph.addEdge(naboo, narnia, 250, false);
    graph.addEdge(naboo, monstropolis, 73, false);
    graph.addEdge(monstropolis, arendelle, 42, false);

    graph.addEdge(pandora, arendelle, 150, false);
    graph.addEdge(metroville, arendelle, 99, false);
    graph.addEdge(metroville, monstropolis, 105, false);
    graph.addEdge(metroville, naboo, 26, false);
    graph.addEdge(metroville, narnia, 37, false);
    graph.addEdge(metroville, pandora, 82, false);

    GetEdges getEdges = new GetEdges();
    String[] names = {"Narnia", "Arendelle", "Naboo"};
    String expected = "False, $0";
    String result = getEdges.getEdges(graph, names);
    assertEquals(expected, result);
  }
  @Test
  public void testGetEdgesForNotFoundCity(){
    Graph<String> graph = new Graph<>(6);
    GraphNode<String> pandora = new GraphNode<>("Pandora");
    GraphNode<String> narnia = new GraphNode<>("Narnia");
    GraphNode<String> metroville = new GraphNode<>("Metroville");
    GraphNode<String> arendelle = new GraphNode<>("Arendelle");
    GraphNode<String> monstropolis = new GraphNode<>("Monstropolis");
    GraphNode<String> naboo = new GraphNode<>("Naboo");

    graph.addNode(pandora.value);
    graph.addNode(metroville.value);
    graph.addNode(arendelle.value);
    graph.addNode(monstropolis.value);
    graph.addNode(naboo.value);
    graph.addNode(narnia.value);

    graph.addEdge(naboo, narnia, 250, false);
    graph.addEdge(naboo, monstropolis, 73, false);
    graph.addEdge(monstropolis, arendelle, 42, false);

    graph.addEdge(pandora, arendelle, 150, false);
    graph.addEdge(metroville, arendelle, 99, false);
    graph.addEdge(metroville, monstropolis, 105, false);
    graph.addEdge(metroville, naboo, 26, false);
    graph.addEdge(metroville, narnia, 37, false);
    graph.addEdge(metroville, pandora, 82, false);

    GetEdges getEdges = new GetEdges();
    String[] names = {"Amman", "Narnia"};
    String result = getEdges.getEdges(graph, names);
    assertNull(result);
  }

  @Test
  public void testGetEdgesForEmptyGraph(){
    Graph<String> graph = new Graph<>(6);

    GetEdges getEdges = new GetEdges();
    String[] names = {"Metroville", "Pandora"};
    String result = getEdges.getEdges(graph, names);
    assertNull(result);
  }
}
