package codes.app.src.main.tree;


public class App {

  public static void main(String[] args){
    Tree tree = new Tree();
    // hard-coded tree

    // root
    tree.root = new Node(2);

//    // left side
//    tree.root.left = new Node(7);
//    tree.root.left.left = new Node(2);
//    tree.root.left.right = new Node(6);
//    tree.root.left.right.left = new Node(50);
//    tree.root.left.right.right = new Node(11);
//
//    // right side
//
//    tree.root.right = new Node(5);
//    tree.root.right.right = new Node(9);
//    tree.root.right.right.left = new Node(4);
    tree.findMaximumValue(tree.root);
    System.out.println(tree.max);

//    System.out.println(Integer.MIN_VALUE);
  }
}
