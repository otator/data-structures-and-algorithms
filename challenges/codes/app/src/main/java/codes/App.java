package codes.app.src.main.java.codes;

public class App {
  public static void main(String[] args){
    FullLinkedList list1 = new FullLinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(2);

    FullLinkedList list2 = new FullLinkedList();
    list2.append(5);
    list2.append(9);
    list2.append(4);
    list2.append(100);
    System.out.println(FullLinkedList.zipLists(list1, list2));
  }
}
