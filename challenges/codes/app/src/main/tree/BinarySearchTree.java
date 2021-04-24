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
        if(temp.value < value){ //left side
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
    result+= " leaf";
    return result;
  }

}
