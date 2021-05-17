package codes.app.src.main.tree;

import codes.app.src.main.java.codes.BinarySearch;

public class BinarySearchTree extends Tree{
  public Node root;
  public BinarySearchTree(){
    super();
  }

  public boolean isEmpty(){
    return root == null;
  }

  public void add(Integer value){
    Node node = new Node(value);
    if(isEmpty()){
      root = node;
    }
    else{
      Node temp = root;
      Node parent;
      while(true){
        parent = temp;
        if(value < temp.value){ //left side
          temp = temp.left;
          if(temp == null) {
            parent.left = node;
            return;
          }
        }else{ //right side
          temp = temp.right;
          if(temp == null){
            parent.right = node;
            return;
          }
        }
      }
    }
  }//end add()

  public boolean contains(Integer value, Node root){
    if (root == null)
      return false;
    Node temp = root;
    while (!temp.value.equals(value)){
      if(value < temp.value)
        temp = temp.left;
      else
        temp = temp.right;

      if (temp == null)
        return false;
    }
    return true;
  }

  private Integer sum = 0;
  private void sumOdd(Node root){
    if(root == null)
      return;

    if(root.value % 2 == 1){
      sum+= root.value;
    }

    sumOdd(root.left);
    sumOdd(root.right);
  }

  public Integer sumOddNodes(Node root){
    sumOdd(root);
    return sum;
  }



//  public Integer findMaximumValue(Node root){
//    if(root == null)
//      return null;
//    Node temp = root;
//    while(temp.right != null){
//      temp = temp.right;
//    }
//    return temp.value;
//  }

  private String result = "root ➔ ";
  public void getTree(Node root){
    result+= root.value + " ➔ ";
    if(root.left != null)
      getTree(root.left);

    if(root.right != null)
      getTree(root.right);
  }

  @Override
  public String toString() {
    getTree(root);
    return result.substring(0,result.length()-3);
  }

}
