package codes.app.src.main.java.codes;

public class App {
  public static void main(String[] args){
    FullLinkedList list = new FullLinkedList();
    list.append(1);
    list.append(3);
    list.append(8);
    list.append(2);
    System.out.println(list);
    System.out.println(list.kthFromEnd(4));
  }
}
