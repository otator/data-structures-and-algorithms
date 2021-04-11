/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codes;

import codes.app.src.main.java.codes.FullLinkedList;
import codes.app.src.main.java.codes.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
   @Test
  public void testInsert(){
     LinkedList list = new LinkedList();
     list.insert(5);
     assertEquals("test insert into linked list", true, list.includes(5));
   }
   @Test
  public void testIncludes(){
     LinkedList list = new LinkedList();
     list.insert(5);
     list.insert(4);
     list.insert(99);
     assertTrue(list.includes(99));
   }

   @Test
  public void testNotIncludes(){
     LinkedList list = new LinkedList();
     list.insert(5);
     list.insert(4);
     assertFalse(list.includes(99));
   }

   @Test
  public void testListValues(){
     LinkedList list = new LinkedList();
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
    assertEquals("tests the insertion of element at the middle", expectedOutput, list.toString());
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
    assertEquals("tests the insertion of element at the middle", expectedOutput, list.toString());

  }


}
