package codes.app.src.main.graph;

public class LinkedList<T>{
  public Node<T> head;

  public LinkedList(){
    head = null;
  }

  public void add(T value, Integer weight){
    Node<T> val = new Node<>(value);
    val.setWeight(weight);
    Node<T> current = head;
    if(head == null){
      head = val;
    }else {
      while (current.next != null) {
        current = current.next;
      }
      current.next = val;
    }
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    Node<T> current = head;
    while(current != null){
      builder.append("(").append(current.value).append(", ").append(current.weight).append(") -> ");
      current = current.next;
    }
    builder.append("null");
    return builder.toString();
  }
}
