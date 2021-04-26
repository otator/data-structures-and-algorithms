package codes.app.src.main.tree;

import java.util.ArrayList;

public class Tree {
  public Node root;
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

  public Integer max = Integer.MIN_VALUE;

  public void findMaximumValue(Node root){
    if(root == null)
      return;
    if(root.value > max)
      max = root.value;

    findMaximumValue(root.left);
    findMaximumValue(root.right);
  }
  public Queue queueOfBreadthFirst = new Queue();
  // for test only
  public ArrayList<Integer> listOfBreadthFirst = new ArrayList<>();
  public void breadthFirst(Node root){
    if(root == null)
      return;
    queueOfBreadthFirst.enqueue(root);
    Node front;
    while (queueOfBreadthFirst.peek() != null){
      front = queueOfBreadthFirst.dequeue();
//      System.out.print(front.value+" ");
      listOfBreadthFirst.add(front.value);

      if(front.left != null)
        queueOfBreadthFirst.enqueue(front.left);

      if(front.right != null)
        queueOfBreadthFirst.enqueue(front.right);

    }

  }

}
