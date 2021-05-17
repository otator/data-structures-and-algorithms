package codes.app.src.main.tree;


import codes.app.src.main.TreeNode;
import codes.app.src.main.utilites.FizzBuzzTree;

public class App {

  public static void main(String[] args){
    BinarySearchTree tree = new BinarySearchTree();
//    tree.add(15);
//    tree.add(10);
//    tree.add(12);
//    tree.add(21);
//    tree.add(17);
//    tree.add(99);
    System.out.println(tree.sumOddNodes(tree.root));


  }
}
