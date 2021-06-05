package codes.app.src.main.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class TestBinarySearchTree {

  @Test
  public void testEmptyTree(){
    BinarySearchTree tree = new BinarySearchTree();
    assertTrue("tests that the tree is empty before adding any nodes",tree.isEmpty());
  }

  @Test
  public void testTreeNullRoot(){
    BinarySearchTree tree = new BinarySearchTree();
    assertNull("test that the root is null before adding any new node",tree.root);
  }

  @Test
  public void testTreeRoot(){
    BinarySearchTree tree = new BinarySearchTree();
    Integer value = 15;
    tree.add(value);
    assertEquals("test the root value, must return true", value, tree.root.value);
  }

  @Test
  public void testAddManyNodes(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(13);
    tree.add(18);
    String output = "root ➔ 15 ➔ 12 ➔ 0 ➔ 13 ➔ 20 ➔ 18";
    assertEquals("test the root value, must return true", output, tree.toString());
  }

  @Test
  public void testPreOrderTraversal(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(13);
    tree.add(18);
    ArrayList<Integer> list = new ArrayList<>();
    list.add(15);
    list.add(12);
    list.add(0);
    list.add(13);
    list.add(20);
    list.add(18);
    tree.preOrder(tree.root);
    assertEquals("tests pre-order traversal", list, tree.preOrderList);
  }

  @Test
  public void testInOrderTraversal(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(13);
    tree.add(18);

    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(12);
    list.add(13);
    list.add(15);
    list.add(18);
    list.add(20);
    tree.inOrder(tree.root);
    assertEquals("tests in-order traversal", list, tree.inOrderList);
  }

  @Test
  public void testPostOrderTraversal(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(13);
    tree.add(18);

    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(13);
    list.add(12);
    list.add(18);
    list.add(20);
    list.add(15);
    tree.postOrder(tree.root);
    assertEquals("tests post-order traversal", list, tree.postOrderList);
  }

  @Test
  public void testContainsTrue(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(13);
    tree.add(18);
    assertTrue("test that a value exists in tree", tree.contains(20, tree.root));
  }

  @Test
  public void testContainsFalse(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(15);
    tree.add(12);
    tree.add(20);
    tree.add(0);
    tree.add(13);
    tree.add(18);
    assertFalse("test that a value NOT  exists in tree", tree.contains(99, tree.root));
  }

  @Test
  public void testContainsEmpty(){
    BinarySearchTree tree = new BinarySearchTree();
    assertFalse("test that a value exists in empty tree", tree.contains(99, tree.root));
  }

}
