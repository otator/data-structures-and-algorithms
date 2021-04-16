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
    length++;
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
      length++;
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
        length++;
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
      length--;
    }
    else{
      Node current = head;
      while(current.next.next != null && current.next.value != value){
        current = current.next;
      }
      current.next = current.next.next;
      length--;
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
//  public Integer kthFromEnd(int index){
//    Node current = head;
//    Integer value = null;
//    int len = this.length()-1;
//    int valueIndex = search(index);
//    if(valueIndex == -1)
//      return value;
//    else{
//      while(len!= index && current.next!= null){
//        len--;
//        current = current.next;
//        value = current.value;
//      }
//      return value;
//    }
//  }

  public int kthFromEnd(int index) {
    if (head == null)
      return -1;
    if (index > length-1 || index < 0) {
      return -1;
    }
    int valueIndexFromEnd = length - index;
    Node current = head;
    for (int i = 1; i < valueIndexFromEnd; i++)
      current = current.next;
    return current.value;
  }

  public static LinkedList zipLists(LinkedList one, LinkedList two){
    Node current1 = one.head;
    Node current2 = two.head;
    Node temp = current1;
    while(temp != null || current2 != null){
      if(temp!=null)
        temp = temp.next;

      if(current2 != null){
        current1.next = current2;
        current2 = current2.next;
        current1 = current1.next ;
      }
      current1.next = temp;
      current1 = current1.next;
    }
    return one;
  }

  public int size(FullLinkedList list){
    int lenght = 0;
    Node current = head;
    while (current != null) {

      lenght+=1;
      current = current.next;
    }
    return lenght;
  }

  public FullLinkedList reverse(FullLinkedList list){
    FullLinkedList reversedList = new FullLinkedList();
    Node current = list.head;
    while (current != null) {
      insertAtFirst(reversedList, current.value);
      current = current.next;
    }
    return reversedList;
  }

  public void insertAtFirst(FullLinkedList list, int val){
    Node value = new Node(val);
    if(list.head == null){
      list.head = value;
    }else{
      value.next = list.head;
      list.head = value;
    }
  }

  public boolean isPalindrome(FullLinkedList list){
    if(list.size(list) % 2 == 0)
      return false;
    else{
      FullLinkedList reversed = reverse(list);
      int length = list.size(list);
      Node currentList = list.head;
      Node currentReversed = reversed.head;
      for(int i=0;i<length; i++){
        if(currentList.value != currentReversed.value){
          return false;
        }
        currentList = currentList.next;
        currentReversed = currentReversed.next;
      }
      return true;
    }


  }


}
