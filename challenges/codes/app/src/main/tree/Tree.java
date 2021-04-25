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


  public ArrayList<Integer> preOrderList = new ArrayList<>();
  public void preOrder(Node root){
    preOrderList.add(root.value);

    if(root.left != null)
      preOrder(root.left);

    if(root.right != null)
      preOrder(root.right);


  }

  public ArrayList<Integer> inOrderList = new ArrayList<>();
  public void inOrder(Node root){
    if(root.left != null)
      inOrder(root.left);
    inOrderList.add(root.value);
    if(root.right != null)
      inOrder(root.right);
  }

  public ArrayList<Integer> postOrderList = new ArrayList<>();
  public void postOrder(Node root){
    if(root.left != null)
      postOrder(root.left);
    if(root.right != null)
      postOrder(root.right);

    postOrderList.add(root.value);
  }

}
