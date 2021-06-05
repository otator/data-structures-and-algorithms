package codes.app.src.main.breadthfirst;

import codes.app.src.main.graph.GraphNode;

public class Queue<T>{
  private GraphNode<T> front;

  public Queue(){
    front = null;
  }

  public void enqueue(GraphNode<T> value){
    if(front == null){
      front = value;
    }else{
      GraphNode<T> current = front;
      while (current.next != null){
        current = current.next;
      }
      current.next = value;
    }
  }

  public GraphNode<T> dequeue(){
    GraphNode<T> temp = front;
    if(front != null)
      front = front.next;
    return temp;
  }

  public GraphNode<T> peek(){
    return front;
  }

  public boolean isEmpty(){
    return front == null;
  }

}
