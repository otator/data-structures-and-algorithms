package codes.app.src.main.TreeIntersection;

import codes.app.src.main.tree.Node;
import codes.app.src.main.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTreeIntersection {

  //-------------------------------- test intersection trees ------------------------------------------//

  @Test
  public void testTwoTrees1(){
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
    ArrayList<Integer> actual = TreeIntersection.intersectionResult;
    TreeIntersection.intersect(tree1.root, tree2.root);
    int expectedSize = 7;
    assertEquals("test intersection of two tree", expectedSize,actual.size() );
  }

  @Test
  public void testTwoTrees2(){
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
    TreeIntersection.intersectionResult = new ArrayList<>();
    TreeIntersection.intersect(tree1.root, tree2.root);
    ArrayList<Integer> actual = TreeIntersection.intersectionResult;
    String expected = "[100, 160, 125, 175, 200, 350, 500]";
    assertEquals("test intersection of two tree", expected,actual.toString());
  }

  @Test
  public void testTwoTreesNoIntersection(){
    //tree1
    Tree tree1 = new Tree();
    //root tree1
    tree1.root = new Node(1);

    //left side of tree1
    tree1.root.left = new Node(3);
    tree1.root.left.left = new Node(5);
    tree1.root.left.right = new Node(7);
    tree1.root.left.right.left = new Node(9);
    tree1.root.left.right.right = new Node(11);



    //right side of tree1
    tree1.root.right = new Node(13);
    tree1.root.right.left = new Node(15);
    tree1.root.right.right = new Node(17);
    tree1.root.right.right.left = new Node(19);
    tree1.root.right.right.right = new Node(21);

    //tree2
    Tree tree2 = new Tree();
    //root tree2
    tree2.root = new Node(0);

    //left side of tree2
    tree2.root.left = new Node(2);
    tree2.root.left.left = new Node(4);
    tree2.root.left.right = new Node(6);
    tree2.root.left.right.left = new Node(8);
    tree2.root.left.right.right = new Node(10);

    //right side of tree2
    tree2.root.right = new Node(12);
    tree2.root.right.left = new Node(14);
    tree2.root.right.right = new Node(16);
    tree2.root.right.right.left = new Node(18);
    tree2.root.right.right.right = new Node(20);
    ArrayList<Integer> actual = TreeIntersection.intersectionResult;
    TreeIntersection.intersect(tree1.root, tree2.root);
    String expected = "[]";
    assertEquals("test intersection of two tree", expected,actual.toString());
  }

  @Test
  public void testTwoTreesOneNull(){
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
    ArrayList<Integer> actual = TreeIntersection.intersectionResult;
    String expected = "[]";
    assertEquals("test intersection of two tree", expected,actual.toString());
  }

}
