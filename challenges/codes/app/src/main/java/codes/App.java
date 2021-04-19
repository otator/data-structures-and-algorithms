package codes.app.src.main.java.codes;

import java.util.Locale;

public class App {
  public static void main(String[] args){
    FullLinkedList list1 = new FullLinkedList();
    list1.append(1);
    list1.append(2);
    list1.append(4);
    list1.append(2);
    list1.append(1);
    list1.append(10);

//    FullLinkedList list2 = new FullLinkedList();
//    list2.append();
//    list2.append();
//    list2.append();
    System.out.println(list1.isPalindrome(list1));

  }
}
