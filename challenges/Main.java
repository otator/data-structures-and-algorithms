public class Main {
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.insert(5);
    list.insert(4);
    list.insert(20);
    list.insert(4);
    System.out.println(list.toString());
    System.out.println(list.includes(5));
  }


}
