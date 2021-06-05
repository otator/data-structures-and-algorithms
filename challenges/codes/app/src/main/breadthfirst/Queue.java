package codes.app.src.main.breadthfirst;

import codes.app.src.main.graph.Node;

public class Queue<T>{
  private Node<T> front;

  public Queue(){
    front = null;
  }

  public void enqueue(Node<T> value){
    if(front == null){
      front = value;
    }else{
      Node<T> current = front;
      while (current.next != null){
        current = current.next;
      }
      current.next = value;
    }
  }

  public Node<T> dequeue(){
    Node<T> temp = front;
    if(front != null)
      front = front.next;
    return temp;
  }

  public Node<T> peek(){
    return front;
  }

  public boolean isEmpty(){
    return front == null;
  }

}
