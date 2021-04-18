package codes.app.src.main.stacksandqueues;

public class PseudoQueue {
  Stack stack1 = new Stack();
  Stack stack2 = new Stack();

  public void enqueue(int val){
    //push the value to the stack
    stack1.push(val);
  }

  public Integer dequeue(){
    //we want the last item in the stack
    // so will push all the stack to new one
    // and pop the new stack which will return the last item of first stack
    Integer value = null;

    //loop until the end of the stack
    while(stack1.peek() != null){
      //push all the nodes to stack2
      stack2.push(stack1.pop());
    }
    if(!stack2.isEmpty()){
      // pop/remove and store the top node of the stack2 in a variable
      value =  stack2.pop();
      // loop to push back the stack2 into stack1
      while (stack2.peek()!= null)
        stack1.push(stack2.pop());
    }
    return value;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("front -> ");
    Integer temp = null;
    //push stack 1 into stack 2
    while(stack1.peek()!= null){
      stack2.push(stack1.pop());
    }
    while (stack2.peek() != null){
      temp = stack2.pop();
      stack1.push(temp);
      result.append("{");
      result.append(temp);
      result.append("} -> ");
    }
    result.append("rare");
    return result.toString();
  }
}
