package codes.app.src.main.hashtable;

public class HashLinkedList {
  public HashNode head;

  public HashLinkedList(){
    head = null;
  }

  public boolean isEmpty(){
    return head == null;
  }

  public void append(HashNode value){
    if(isEmpty())
      head = value;
    else{
      HashNode current = head;
      while(current.next != null){
        current = current.next;
      }
      current.next = value;
    }
  }

  public void appendWithUpdate(String value) {
    if (isEmpty())
      head = new HashNode(value);
    else {
      String key = value.split(":")[0];
      HashNode current = head;
      while (current.next!= null){
        // check if current node has the same key
        if(current.value.contains(key)){
          current.value = value;
          break;
        }
        current = current.next;
      }
      current.next = new HashNode(value);
    }
  }
}
