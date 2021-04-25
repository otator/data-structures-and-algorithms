package codes.app.src.main.tree;


public class App {

  public static void main(String[] args){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(13);
    tree.add(18);
//    System.out.println("root: " + tree.root.value);
//    tree.preOrder(tree.root);
////    Collections.reverse(tree.preOrderList);
//    System.out.println("preOrder:  " + tree.preOrderList);
//    tree.inOrder(tree.root);
////    Collections.reverse(tree.inOrderList);
//    System.out.println("InOrder:  " + tree.inOrderList);
//    tree.postOrder(tree.root);
////    Collections.reverse(tree.postOrderList);
//    System.out.println("postOrder:  " + tree.postOrderList);

    System.out.println(tree);
    System.out.println(tree.contains(20, tree.root));
  }
}
