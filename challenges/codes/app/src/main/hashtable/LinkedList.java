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

  public void appendWithUpdate(String value) {
    if (isEmpty())
      head = new Node(value);
    else {
      String key = value.split(":")[0];
      Node current = head;
      while (current.next!= null){
        // check if current node has the same key
        if(current.value.contains(key)){
          current.value = value;
          break;
        }
        current = current.next;
      }
      current.next = new Node(value);
    }
  }
}
