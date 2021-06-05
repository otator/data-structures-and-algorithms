/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codes;

import codes.app.src.main.java.codes.FirstLinkedList;
import codes.app.src.main.java.codes.FullLinkedList;
import codes.app.src.main.tree.Node;
import codes.app.src.main.tree.Tree;
import codes.app.src.main.utilites.FizzBuzzTree;
import codes.app.src.main.utilites.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
   @Test
  public void testInsert(){
     FirstLinkedList list = new FirstLinkedList();
     list.insert(5);
     assertTrue("test insert into linked list", list.includes(5));
   }
   @Test
  public void testIncludes(){
     FirstLinkedList list = new FirstLinkedList();
     list.insert(5);
     list.insert(4);
     list.insert(99);
     assertTrue(list.includes(99));
   }

   @Test
  public void testNotIncludes(){
     FirstLinkedList list = new FirstLinkedList();
     list.insert(5);
     list.insert(4);
     assertFalse(list.includes(99));
   }

   @Test
  public void testListValues(){
     FirstLinkedList list = new FirstLinkedList();
     list.insert(5);
     list.insert(4);
     assertEquals("test the values of the list", "{4} -> {5} -> NULL", list.toString());
   }




  @Test
  public void testOneAtTheEnd(){
    FullLinkedList list = new FullLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.append(99);
    String expectedOutput = "{15} -> {10} -> {5} -> {99} -> NULL";
    assertEquals("tests the append of one element at the end", expectedOutput, list.toString());
  }
  @Test
  public void testManyAtTheEnd(){
    FullLinkedList list = new FullLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.append(99);
    list.append(-4);
    list.append(2021);
    String expectedOutput  = "{15} -> {10} -> {5} -> {99} -> {-4} -> {2021} -> NULL";
    assertEquals("tests the append of many elements at the end", expectedOutput, list.toString());
  }
  @Test
  public void testInsertBeforeTheMiddleElement(){
    FullLinkedList list = new FullLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.append(99);
    list.insertBefore(5, 117);
    String expectedOutput  = "{15} -> {10} -> {117} -> {5} -> {99} -> NULL";
    assertEquals("tests the insertion of element at the middle", expectedOutput, list.toString());
  }

  @Test
  public void testInsertBeforeFirstElement(){
    FullLinkedList list = new FullLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.append(99);
    list.insertBefore(15, 117);
    String expectedOutput  = "{117} -> {15} -> {10} -> {5} -> {99} -> NULL";
    assertEquals("tests the insertion of element before the first element", expectedOutput, list.toString());
  }

  @Test
  public void testInsertAfterTheMiddle(){
    FullLinkedList list = new FullLinkedList();
    list.append(5);
    list.append(10);
    list.append(15);
    list.append(99);
    list.append(-4);
    list.insertAfter(15, 200);
    String expectedOutput  = "{5} -> {10} -> {15} -> {200} -> {99} -> {-4} -> NULL";
    assertEquals("tests the insertion of element after the middle", expectedOutput, list.toString());
  }

  @Test
  public void testInsertAfterTheLastElement(){
    FullLinkedList list = new FullLinkedList();
    list.append(5);
    list.append(10);
    list.append(15);
    list.append(99);
    list.append(-4);
    list.insertAfter(-4, 2021);
    String expectedOutput  = "{5} -> {10} -> {15} -> {99} -> {-4} -> {2021} -> NULL";
    assertEquals("tests the insertion of element after last element", expectedOutput, list.toString());
  }
  @Test
  public void testDeleteElements(){
    FullLinkedList list = new FullLinkedList();
    list.append(5);
    list.append(10);
    list.append(15);
    list.delete(5);
    list.delete(10);
    String expectedOutput  = "{15} -> NULL";
    assertEquals("tests of deleting some elements from the list", expectedOutput, list.toString());
  }

  @Test
  public void testDeleteEmptyElement(){
    FullLinkedList list = new FullLinkedList();
    list.delete(5);
    String expectedOutput  = "NULL";
    assertEquals("tests of deleting from empty list", expectedOutput, list.toString());
  }

  @Test
  public void testKthFromEnd1(){
    FullLinkedList list = new FullLinkedList();
    list.append(1);
    list.append(3);
    list.append(8);
    list.append(2);
    int expected = 2;
    assertEquals("tests the last element in the list", expected, list.kthFromEnd(0));
  }

  @Test
  public void testKthFromEnd2(){
    FullLinkedList list = new FullLinkedList();
    list.append(1);
    list.append(3);
    list.append(8);
    list.append(2);
    int expected = 3;
    assertEquals("tests the last element in the middle", expected, list.kthFromEnd(2));
  }

  @Test
  public void testKthFromEnd3(){
    FullLinkedList list = new FullLinkedList();
    list.append(1);
    list.append(3);
    list.append(8);
    list.append(2);
    int expected = -1;
    assertEquals("tests not found index which must return -1", expected, list.kthFromEnd(10));
  }


  @Test
  public void testKthFromEndNegativeNumber(){
    FullLinkedList list = new FullLinkedList();
    list.append(1);
    list.append(3);
    list.append(8);
    list.append(2);
    int expected = -1;
    assertEquals("tests not found index which must return -1", expected, list.kthFromEnd(-2));
  }

  @Test
  public void testKthFromEndEmptyList() {
    FullLinkedList list = new FullLinkedList();
    int expected = -1;
    assertEquals("tests not found index which must return -1", expected, list.kthFromEnd(0));
  }

  @Test
  public void testZipEqual(){
    FullLinkedList list1 = new FullLinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(2);

    FullLinkedList list2 = new FullLinkedList();
    list2.append(5);
    list2.append(9);
    list2.append(4);
    String expected = "{1} -> {5} -> {3} -> {9} -> {2} -> {4} -> NULL";
    FirstLinkedList zip = FullLinkedList.zipLists(list1, list2);
    assertEquals("test two equals linked lists", expected, zip.toString());
  }

  @Test
  public void testZipDifferent(){
    FullLinkedList list1 = new FullLinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(2);

    FullLinkedList list2 = new FullLinkedList();
    list2.append(5);
    list2.append(9);
    list2.append(4);
    list2.append(100);
    String expected = "{1} -> {5} -> {3} -> {9} -> {2} -> {4} -> {100} -> NULL";
    FirstLinkedList zip = FullLinkedList.zipLists(list1, list2);
    assertEquals("test two different linked lists in length", expected, zip.toString());
  }

  @Test
  public void testOneNull(){
    FullLinkedList list1 = new FullLinkedList();

    FullLinkedList list2 = new FullLinkedList();
    list2.append(5);
    list2.append(9);
    list2.append(4);
    list2.append(100);
    String expected = "{5} -> {9} -> {4} -> {100} -> NULL";

    FirstLinkedList zip = FullLinkedList.zipLists(list1, list2);
    assertEquals("test one empty linked lists",expected,zip.toString());
  }
  @Test
  public void testOneNull2(){
    FullLinkedList list1 = new FullLinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(2);

    FullLinkedList list2 = new FullLinkedList();

    String expected = "{1} -> {3} -> {2} -> NULL";
    FirstLinkedList zip = FullLinkedList.zipLists(list1, list2);
    assertEquals("test one empty linked lists",expected,zip.toString());
  }

  @Test
  public void testTwoNulls(){
    FullLinkedList list1 = new FullLinkedList();
    FullLinkedList list2 = new FullLinkedList();

    FirstLinkedList zip = FullLinkedList.zipLists(list1, list2);
    assertNull("test two empty linked lists",zip);
  }





  @Test
  public void testMaximumValueTree(){
    Tree tree = new Tree();
    // hard-coded tree

    // root
    tree.root = new Node(2);

    // left side
    tree.root.left = new Node(7);
    tree.root.left.left = new Node(2);
    tree.root.left.right = new Node(6);
    tree.root.left.right.left = new Node(5);
    tree.root.left.right.right = new Node(11);

    // right side

    tree.root.right = new Node(5);
    tree.root.right.right = new Node(9);
    tree.root.right.right.left = new Node(4);
    Integer actual = tree.findMaximumValue(tree.root);
    Integer expected = 11;
    assertEquals("tests the max value in tree which is 11", expected,actual);
  }

  @Test
  public void testMaximumOneValueTree(){
    Tree tree = new Tree();
    // hard-coded tree

    // root
    tree.root = new Node(2);
    Integer actual = tree.findMaximumValue(tree.root);
    Integer expected = 2;
    assertEquals("tests the max value in one-value tree which is 2", expected, actual);
  }

  @Test
  public void testMaximumValueEmptyTree(){
    Tree tree = new Tree();
    Integer expected = Integer.MIN_VALUE;
    Integer actual = tree.findMaximumValue(tree.root);
    assertEquals("tests the max value in empty tree, the max will be the minimum value of Integer", expected, actual);
  }

  @Test
  public void testBreadthFirst(){
    Tree tree = new Tree();
    // hard-coded tree

    // root
    tree.root = new Node(2);

    // left side
    tree.root.left = new Node(7);
    tree.root.left.left = new Node(2);
    tree.root.left.right = new Node(6);
    tree.root.left.right.left = new Node(5);
    tree.root.left.right.right = new Node(11);

    // right side

    tree.root.right = new Node(5);
    tree.root.right.right = new Node(9);
    tree.root.right.right.left = new Node(4);

    tree.breadthFirst(tree.root);
    ArrayList<Integer> expected= new ArrayList<>();
    expected.add(2);
    expected.add(7);
    expected.add(5);
    expected.add(2);
    expected.add(6);
    expected.add(9);
    expected.add(5);
    expected.add(11);
    expected.add(4);
    assertEquals("test breadth first tree", expected, tree.listOfBreadthFirst);

  }
  @Test
  public void testBreadthFirstOneValue(){
    Tree tree = new Tree();
    // hard-coded tree

    // root
    tree.root = new Node(2);

    tree.breadthFirst(tree.root);
    ArrayList<Integer> expected= new ArrayList<>();
    expected.add(2);
    assertEquals("test breadth first tree", expected, tree.listOfBreadthFirst);

  }

  @Test
  public void testBreadthFirstEmpty(){
    Tree tree = new Tree();
    // hard-coded tree


    tree.breadthFirst(tree.root);
    ArrayList<Integer> expected= new ArrayList<>();
    assertEquals("test breadth first tree", expected, tree.listOfBreadthFirst);

  }

  @Test
  public void testEmptyFizzBuzzTree(){}{
    FizzBuzzTree tree = new FizzBuzzTree();
    tree.fizzBuzzTree(tree.root);
    assertNull("test empty fizz buzz tree", tree.root);
  }

  @Test
  public void testFizzBuzzTreeRoot1(){}{
    FizzBuzzTree tree = new FizzBuzzTree();
    tree.fizzBuzzTree(tree.root);
    tree.root = new TreeNode(3);

    // left side
    tree.root.left = new TreeNode(5);
    tree.root.left.left = new TreeNode(10);
    tree.root.left.right = new TreeNode(15);
    tree.root.left.right.left = new TreeNode(20);
    tree.root.left.right.right = new  TreeNode(25);

    // right side
    tree.root.right = new TreeNode(30);
    tree.root.right.right = new TreeNode(35);
    tree.root.right.right.left = new TreeNode(79);
    tree.fizzBuzzTree(tree.root);
    assertEquals("test the root is equal to fizz", "Fizz", tree.root.value);
  }

  @Test
  public void testFizzBuzzTreeRoot2(){}{
    FizzBuzzTree tree = new FizzBuzzTree();
    tree.fizzBuzzTree(tree.root);
    tree.root = new TreeNode(5);

    tree.fizzBuzzTree(tree.root);
    assertEquals("test the root is equal to buzz", "Buzz", tree.root.value);
  }

  @Test
  public void testFizzBuzzTreeRoot3(){}{
    FizzBuzzTree tree = new FizzBuzzTree();
    tree.fizzBuzzTree(tree.root);
    tree.root = new TreeNode(30);

    tree.fizzBuzzTree(tree.root);
    assertEquals("test the root is equal to fizz buzz", "FizzBuzz", tree.root.value);
  }
  @Test
  public void testFizzBuzzTreeRoot4(){}{
    FizzBuzzTree tree = new FizzBuzzTree();
    tree.fizzBuzzTree(tree.root);
    tree.root = new TreeNode(101);

    tree.fizzBuzzTree(tree.root);
    assertEquals("test the root is equal to '101' ", "101", tree.root.value);
  }
  @Test
  public void testFizzBuzzTree(){}{
    FizzBuzzTree tree = new FizzBuzzTree();
    tree.fizzBuzzTree(tree.root);
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
    String expected = "root ➔ Fizz ➔ 7 ➔ 4 ➔ FizzBuzz ➔ Fizz ➔ Buzz ➔ FizzBuzz ➔ FizzBuzz ➔ 79";
    assertEquals("test the all tree nodes", expected, tree.toString());
  }





}
