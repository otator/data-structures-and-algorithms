package codes.app.src.main.tree;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Tree {
  Node root;
  public Tree(){
    root = null;
  }

  public boolean isEmpty(){
    return root == null;
  }

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

  public ArrayList<Integer> preOrderList = new ArrayList<>();
  public void preOrder(Node root){
    preOrderList.add(root.value);

    if(root.right != null)
      preOrder(root.right);

    if(root.left != null)
      preOrder(root.left);


  }

  public ArrayList<Integer> inOrderList = new ArrayList<>();
  public void inOrder(Node root){
    if(root.right != null)
      inOrder(root.right);
    inOrderList.add(root.value);
    if(root.left != null)
      inOrder(root.left);
  }

  public ArrayList<Integer> postOrderList = new ArrayList<>();
  public void postOrder(Node root){
    if(root.right != null)
      postOrder(root.right);
    if(root.left != null)
      postOrder(root.left);

    postOrderList.add(root.value);
  }

}
