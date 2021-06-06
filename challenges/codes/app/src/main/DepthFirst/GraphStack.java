package codes.app.src.main.DepthFirst;
import codes.app.src.main.graph.GraphNode;

public class GraphStack<T>{

  private GraphNode<T> top;

  public GraphStack(){
    top = null;
  }

  protected void push(GraphNode<T> node){
    if(top == null)
      top = node;
    else{
      node.next = top;
      top = node;
    }
  }

  protected GraphNode<T> pop(){
    if (top == null)
      return null;
    GraphNode<T> temp = top;
    top = top.next;
    return temp;
  }

  protected GraphNode<T> peek(){
    return top;
  }

  protected boolean isEmpty(){
    return top == null;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("top").append("\n");
    GraphNode<T> current = top;
    while(current != null){
      result.append(current.value).append("\n");
      current = current.next;
    }
    return result.toString();
  }
}
