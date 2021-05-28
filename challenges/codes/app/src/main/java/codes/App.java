package codes.app.src.main.java.codes;

import java.util.Locale;
import codes.app.src.main.java.codes.LinkedList.Node;

public class App {
  public static void main(String[] args){
    FullLinkedList list = new FullLinkedList();
    list.append(1);
    list.append(1);
    list.append(4);
    list.append(3);
    list.append(8);
    list.append(1);
    list.append(13);
    list.append(1);
    list.append(1);
    list.append(1);
    Node head = deleteValue(list.head, 1);
    Node current = head;
    while(current != null){
      System.out.print(current.value + " -> ");
      current = current.next;
    }
    System.out.print(" null");


//    System.out.println(list);



  }

  public static Node deleteValue(Node head, int n){
    if(head == null)
      return null;
    while(head.value == n){
      head = head.next;
    }
    Node previous = head;
    Node current = head;
    while(current != null){
      if(current.value == n){
        previous.next = current.next;
        current = previous;
      }
      previous = current;
      current = current.next;
    }
    return head;
  }
}
