package codes.app.src.main.java.codes;

public class LinkedList {
  Node head;
  public LinkedList(){
    head = null;
  }

  static class Node{
    int value;
    Node next;
    public Node(int v){
      value = v;
      next = null;
    }
  }

  public void insert(int n){
    Node node = new Node(n);
    if (head == null) {
      head = node;
    }else{
      node.next = head;
      head = node;
    }
  }

  public boolean includes(int n){
    boolean found = false;
    Node current = head;
    while(current!= null){
      if(current.value == n){
        System.out.println(current.value);
        found = true;
        break;
      }

      current = current.next;
    }
    return found;
  }

  @Override
  public String toString() {
    String result = "";
    Node current = head;
    while(current != null){
      result+="{" + current.value + "} -> ";
      current = current.next;
    }
    return result + "NULL";
  }
}
