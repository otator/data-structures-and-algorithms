package codes.app.src.main.tree;

public class Node {
  public Integer value;
  public Node right;
  public Node left;
  public Node(Integer value){
    this.value = value;
    right = null;
    left = null;
  }
}
