package codes.app.src.main.utilites;

public class MultiBracketValidation {

  public static boolean multiBracketValidation(String input){
    Stack stack = new Stack();
    boolean notRemoved;
    for(int i=0; i< input.length(); i++){
      
      if(input.charAt(i) == '}' && !stack.isEmpty()){
        notRemoved = stack.popUntilValue("{", "(", "[");
      }
      else if(input.charAt(i) == ']' && !stack.isEmpty()){
        notRemoved = stack.popUntilValue("[", "{", "(");
      }
      else if(input.charAt(i) == ')' && !stack.isEmpty()){
        notRemoved = stack.popUntilValue("(", "[", "{");
      }
      else {
        notRemoved = (input.charAt(i) != ']' && input.charAt(i) != ')' && input.charAt(i) != '}') || !stack.isEmpty();
        stack.push(input.charAt(i) + "");
      }
      if(!notRemoved)
        break;
    }//end loop
    return stack.isEmpty();
  }
}


