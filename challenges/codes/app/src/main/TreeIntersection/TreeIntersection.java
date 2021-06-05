package codes.app.src.main.TreeIntersection;

import codes.app.src.main.tree.Node;

import java.util.ArrayList;

public class TreeIntersection {
  public static ArrayList<Integer> intersectionResult = new ArrayList<>();
  private static Node root;
  public static void intersect(Node root1, Node root2){
    root = root1;
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
