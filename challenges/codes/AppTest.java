/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codes;

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
}
