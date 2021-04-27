package codes.app.src.main.tree;


import codes.app.src.main.TreeNode;
import codes.app.src.main.utilites.FizzBuzzTree;

public class App {

  public static void main(String[] args){
    FizzBuzzTree tree = new FizzBuzzTree();
//     hard-coded tree

    tree.root = new TreeNode(3);

    // left side
    tree.root.left = new TreeNode(7);
    tree.root.left.left = new TreeNode(4);
    tree.root.left.right = new TreeNode(15);
    tree.root.left.right.left = new TreeNode(21);
    tree.root.left.right.right = new  TreeNode(25);

    // right side
    tree.root.right = new TreeNode(30);
    tree.root.right.right = new TreeNode(0);
    tree.root.right.right.left = new TreeNode(79);
    tree.fizzBuzzTree(tree.root);
    System.out.println(tree);

  }
}
