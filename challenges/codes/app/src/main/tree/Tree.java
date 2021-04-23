package codes.app.src.main.tree;

import java.util.ArrayList;

public class Tree {
  Node root;
  public Tree(){
    root = null;
  }

//  public boolean isEmpty(){
//    return root == null;
//  }

//  public void add(Integer value){
//    Node node = new Node(value);
//    if(isEmpty()){
//      root = node;
//    }
//    else{
//      Node temp = root;
//      if(node.value < root.value) {
//        while (temp.left != null) {
//          temp = temp.left;
//        }
//        temp.left = node;
//      }else{
//        while(temp.right != null){
//          temp = temp.right;
//        }
//        temp.right = node;
//      }
//
//    }
//  }

  ArrayList<Integer> preOrderList = new ArrayList<>();
  public void preOrder(Node root){
    preOrderList.add(root.value);
    if(root.left != null)
      preOrder(root.left);

    if(root.right != null)
      preOrder(root.right);
  }

  ArrayList<Integer> inOrderList = new ArrayList<>();
  public void inOrder(Node root){
    if(root.left != null)
      inOrder(root.left);
    inOrderList.add(root.value);
    if(root.right != null)
      inOrder(root.right);
  }

  ArrayList<Integer> postOrderList = new ArrayList<>();
  public void postOrder(Node root){
    if(root.left != null)
      postOrder(root.left);
    if(root.right != null)
      postOrder(root.right);

    postOrderList.add(root.value);
  }

//  private String result = "root ➔ ";
//  public void getTree(Node root){
//    result+= root.value + " ➔ ";
//    if(root.left != null)
//      getTree(root.left);
//
//    if(root.right != null)
//      getTree(root.right);
//  }
//
//  @Override
//  public String toString() {
//    getTree(root);
//    result+= " leaf";
//    return result;
//  }
}
