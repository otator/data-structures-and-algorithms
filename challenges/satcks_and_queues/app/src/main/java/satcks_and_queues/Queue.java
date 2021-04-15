package satcks_and_queues;

public class Queue {
  Node front;
  Node rear;
  public Queue(){
    front = null;
    rear = null;
  }
  public boolean isEmpty(){
    return front == null;
  }

  public void enqueue(int val){
    Node value = new Node(val);
    if(isEmpty()){
      front = value;
      rear = value;
      front.previous = rear;
    }else {
      rear.previous = value;
      value.next = rear;
      rear = value;
    }
  }

  public Integer dequeue() {
    if (!isEmpty()) {
      Node temp = front;
      front = front.previous;
      if(front!=null)
        // avoid  null pointer exception
        front.next = null;
      else{
        //once the front is null, means the queue is empty, so empty rear as well
        rear = null;
      }
      return temp.value;
    }
    return null;
  }

  public Integer peek(){
    if(!isEmpty())
      return front.value;
    return null;
  }

  @Override
  public String toString(){
    String result = "rare ➔ ";
    Node current = rear;
    while(current!= null){
      result+="{" + current.value + "} ➔ " ;
      current = current.next;
    }
    result+= "front";
    return result;
  }

}
