package codes.app.src.main.java.codes;

public class FullLinkedList extends LinkedList{
  public FullLinkedList(){
    super();
  }

  public void append(int n) {
    Node value = new Node(n);
    if (head == null) {
      head = value;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = value;
    }
  }

  public void insertAfter(int value, int newValue){
    // if the value is being inserted after is not exist? add the new value at the end.
    if(!this.includes(value)){
      append(newValue);
    }else{
      Node n = new Node(newValue);
      Node current = head;
      while(current.value != value && current.next!= null){
        current = current.next;
      }
      n.next = current.next;
      current.next = n;
    }
  }

  public void insertBefore(int value, int newValue){
    // if the value is being inserted after is not exist? add the new value at the beginning.
    if(!this.includes(value)){
      insert(newValue);
    }else {
      //check if the value is the first element
      if (head.value == value) {
        insert(newValue);
      } else {
        Node n = new Node(newValue);
        Node current = head;
        while (current.next != null && current.next.value != value) {
          current = current.next;
        }
        n.next = current.next;
        current.next = n;
      }
    }
  }

  public void delete(int value){
    //if the value trying to delete is not in the list
    if(!this.includes(value)){
      System.out.println("Value: " + value + " is NOT in the list");
    }
    //if the value trying to delete is the first value
    else if(head.value == value){
      head = head.next;
    }
    else{
      Node current = head;
      while(current.next.next != null && current.next.value != value){
        current = current.next;
      }
      current.next = current.next.next;
    }
  }

  //helper method to get the length of a linkedlist
  public int length(){
    int len = 0;
    Node current = head;
    while(current!= null){
      current = current.next;
      len++;
    }
    return len;
  }

  public int search(int index){
    if(index <= this.length() && index >=0)
      return this.length() - index;
    return -1;
  }
  public Integer kthFromEnd(int index){
    Node current = head;
    Integer value = null;
    int len = this.length()-1;
    int valueIndex = search(index);
    if(valueIndex == -1)
      return value;
    else{
      while(len!= index && current.next!= null){
        len--;
        current = current.next;
        value = current.value;
      }
      return value;
    }
  }

}
