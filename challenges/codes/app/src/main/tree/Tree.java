package codes.app.src.main.tree;


import java.util.ArrayList;
public class Tree {
  public static ArrayList<Integer> intersectionResult = new ArrayList<>();
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

  private Integer max = Integer.MIN_VALUE;

  private void findMaxValue(Node root){
    if(root == null)
      return;
    if(root.value > max)
      max = root.value;

    findMaxValue(root.left);
    findMaxValue(root.right);
  }

  public Integer findMaximumValue(Node root){
    findMaxValue(root);
    return max;
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
  public static void intersect(Node root1, Node root2){
    if(root1 == null || root2 == null)
      return;
    if(root1.value.equals(root2.value))
      intersectionResult.add(root1.value);

    intersect(root1.left, root2.left);
    intersect(root1.right, root2.right);
  }

  private String result = "root ➔ ";
  public void getTree(Node root){
    if(root == null)
      return;
    result+= root.value + " ➔ ";
    if(root.left != null)
      getTree(root.left);

    if(root.right != null)
      getTree(root.right);
  }

  @Override
  public String toString() {
    getTree(root);
    return result.substring(0, result.length() - 3);
  }

}
