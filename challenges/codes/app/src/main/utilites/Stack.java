package codes.app.src.main.utilites;

public class Stack {
  Node top;
  public Stack(){
    top = null;
  }

  public void push(String value){
    Node node = new Node(value);
    if(isEmpty()){
      top = node;
    }
    else{
      node.next = top;
      top = node;

    }
  }

  public String pop(){
    if(isEmpty())
      return null;
    else{
      Node temp = top;
      top = top.next;
      return temp.value;
    }
  }

  public boolean popUntilValue(String value, String notValueOne, String notValueTwo){
    boolean removed = false;
    if (!isEmpty()) {
      while (!peek().equals(value) && !peek().equals(notValueOne) && !peek().equals(notValueTwo)) {
        pop();
        if(isEmpty())
          return true;
      }
      if(!peek().equals(notValueOne) && !peek().equals(notValueTwo)) {
        pop();
        removed  = true;
      }
    }
    return removed;
  }

  public String peek(){
    return top.value;
  }

  public boolean isEmpty(){
    return top == null;
  }

  @Override
  public String toString(){
    String result = "top -> ";
    Node current = top;
    while(current!=null){
      result+=current.value+" -> ";
      current = current.next;
    }

    result+= "Null";
    return result;
  }
}
