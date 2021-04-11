package codes.app.src.main.java.codes;

public class App {
  public static void main(String[] args){
    FullLinkedList list = new FullLinkedList();
    list.append(5);
    list.append(10);
    list.append(15);
    list.append(99);
    list.append(-4);
    list.insertBefore(5, 2021);
    System.out.println(list);
  }
}
