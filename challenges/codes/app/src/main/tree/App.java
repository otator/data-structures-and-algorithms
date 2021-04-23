package codes.app.src.main.tree;

public class App {

  public static void main(String[] args){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(1);
    tree.add(18);
    tree.preOrder(tree.root);
    System.out.println("preOrder:  " + tree.preOrderList);
    tree.inOrder(tree.root);
    System.out.println("InOrder:  " + tree.inOrderList);
    tree.postOrder(tree.root);
    System.out.println("postOrder:  " + tree.postOrderList);

    System.out.println(tree);
  }
}
