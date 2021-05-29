package codes.app.src.main.tree;


import codes.app.src.main.utilites.FizzBuzzTree;

import java.util.ArrayList;

public class App {
  public static void main(String[] args){
    //tree1
    Tree tree1 = new Tree();
    //root tree1
    tree1.root = new Node(150);

    //left side of tree1
    tree1.root.left = new Node(100);
    tree1.root.left.left = new Node(75);
    tree1.root.left.right = new Node(160);
    tree1.root.left.right.left = new Node(125);
    tree1.root.left.right.right = new Node(175);



    //right side of tree1
    tree1.root.right = new Node(250);
    tree1.root.right.left = new Node(200);
    tree1.root.right.right = new Node(350);
    tree1.root.right.right.left = new Node(300);
    tree1.root.right.right.right = new Node(500);

    //tree2
    Tree tree2 = new Tree();
    //root tree2
    tree2.root = new Node(42);

    //left side of tree2
    tree2.root.left = new Node(100);
    tree2.root.left.left = new Node(15);
    tree2.root.left.right = new Node(160);
    tree2.root.left.right.left = new Node(125);
    tree2.root.left.right.right = new Node(175);

    //right side of tree2
    tree2.root.right = new Node(600);
    tree2.root.right.left = new Node(200);
    tree2.root.right.right = new Node(350);
    tree2.root.right.right.left = new Node(4);
    tree2.root.right.right.right = new Node(500);


    System.out.println(tree1);
    System.out.println(tree2);
    Tree.intersect(tree1.root, tree2.root);
    System.out.println(Tree.intersectionResult);

  }


}
