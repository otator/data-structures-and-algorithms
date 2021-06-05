package codes.app.src.main.graph;

import java.util.Objects;

public class GraphNode<T> {
  public T value;
  public Integer weight;
  public GraphNode next;
  public GraphNode(T value){
    this.value = value;
    next = null;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GraphNode node = (GraphNode) o;
    return Objects.equals(value, node.value) ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, weight, next);
  }
}
