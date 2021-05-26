package codes.app.src.main.hashtable;

public class LinkedList {
  public Node head;

  public LinkedList(){
    head = null;
  }

  public boolean isEmpty(){
    return head == null;
  }

  public void append(Node value){
    if(isEmpty())
      head = value;
    else{
      Node current = head;
      while(current.next != null){
        current = current.next;
      }
      current.next = value;
    }
  }

}

class Node{
  String value;
  Node next;

   public Node(String value){
     this.value = value;
     next = null;
   }
}
