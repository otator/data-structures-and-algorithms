package codes.app.src.main.stacksandqueues;

import codes.app.src.main.stacksandqueues.Node;

public class Stack {
  Node top;
  Stack maxStack;
  public Stack(){
    top = null;
  }



  public void push(int val){
    Node value = new Node(val);
    Node value2 = new Node(val);
    if(isEmpty()) {
      top = value;
      maxStack = new Stack();
      maxStack.top = value;
    }
    else{
      value.next = top;
      top = value;
      if(maxStack.peek() < value2.value){
        value2.next = maxStack.top;
        maxStack.top = value2;
      }
    }
  }

  public Integer pop(){
    if(!isEmpty()){
      //check if the maxStack top value is the same as the stack
      // if so, pop from both
      if(peek().equals(maxStack.peek())) {
        //store maxStack top value temporary
        Node tempMax = maxStack.top;
        // point the maxStack top to the next value
        maxStack.top = maxStack.top.next;
        // point the stack top to the next value as well
        top = top.next;
        // return the tempMax value which also equal to stack top value
        return tempMax.value;
      }
      // if they are not equal
      // store stack top in temporary variable
      Node temp = top;
      //point the top to the next value
      top = top.next;
      // return the temporary value
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
