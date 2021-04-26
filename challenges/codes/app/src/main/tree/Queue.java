package codes.app.src.main.tree;


public class Queue {
  Node front;
  Node rear;

  public Queue() {
    front = null;
    rear = null;
  }

  public boolean isEmpty() {
    return front == null;
  }

  public void enqueue(Node value) {
    if (isEmpty()) {
      front = value;
      front.previous = rear;
      rear = value;
    } else {
      rear.previous = value;
      value.next = rear;
      rear = value;
    }
  }

  public Node dequeue() {
    if (!isEmpty()) {
      Node temp = front;
      front = front.previous;
      if (front != null)
        // avoid  null pointer exception
        front.next = null;
      else {
        //once the front is null, means the queue is empty, so empty rear as well
        rear = null;
      }
      return temp;
    }
    return null;
  }

  public Node peek() {
    if (!isEmpty())
      return front;
    return null;
  }

  @Override
  public String toString() {
    String result = "rare ➔ ";
    Node current = rear;
    while (current != null) {
      result += "{" + current.value + "} ➔ ";
      current = current.next;
    }
    result += "front";
    return result;
  }
}
