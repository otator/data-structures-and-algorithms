package codes.app.src.main.tree;

import codes.app.src.main.java.codes.BinarySearch;

public class BinarySearchTree extends Tree{
  Node root;
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
      if(node.value < temp.value) {
        temp = temp.left;
        while (temp!= null) {
          if(node.value < temp.value  && temp.left == null)
            temp.left = node;
          
        }
        temp.left = node;
      }else{
        while(temp.right != null){
          temp = temp.right;
        }
        temp.right = node;
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
