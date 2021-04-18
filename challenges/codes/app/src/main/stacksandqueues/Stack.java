package codes.app.src.main.stacksandqueues;

import codes.app.src.main.stacksandqueues.Node;

public class Stack {
  Node top;
  public Stack(){
    top = null;
  }

  public void push(int val){
    Node value = new Node(val);
    if(isEmpty())
      top = value;
    else{
      value.next = top;
      top = value;
    }
  }

  public Integer pop(){
    if(!isEmpty()){
      Node temp = top;
      top = top.next;
      return temp.value;
    }

    return null;
  }

  public boolean isEmpty(){
    return top == null;
  }

  public Integer peek(){
    if(!isEmpty())
      return top.value;
    return null;
  }

  @Override
  public String toString(){
    String result="";
    Node current = top;
    while(current!= null){
      result+= "{" + current.value + "}\n" + " ↓" + "\n";
      current = current.next;
    }
    result+="NULL";
    return result;
  }

}
