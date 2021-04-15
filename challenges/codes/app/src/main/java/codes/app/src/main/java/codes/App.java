package codes.app.src.main.java.codes;

public class App {
  public static void main(String[] args){
    FullLinkedList list1 = new FullLinkedList();
//    list1.append(1);
//    list1.append(2);
//    list1.append(3);
//    list1.append(2);
//    list1.append(1);
    list1.insert(10);
    list1.insert(20);
    list1.insert(10);
    System.out.println(list1);
    FullLinkedList list2 = list1.reverse(list1);
    System.out.println(list2);

    System.out.println(list1.isPalindrome(list1));

  }
}
