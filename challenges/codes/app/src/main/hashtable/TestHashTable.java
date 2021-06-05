package codes.app.src.main.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestHashTable {


  //-------------------------------- test hash table ------------------------------------------//

  @Test
  public void testFindOfExists(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    String expected = "AbdalQader";
    String actual = hashTable.find("name");
    assertEquals("tests find method", expected, actual);
  }

  @Test
  public void testFindOfNotExists(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    String actual = hashTable.find("name2");
    assertNull("tests find method", actual);
  }

  @Test
  public void testFindOfExistsWithCollision(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    hashTable.add("mean", "Mhemed");
    String expected = "Mhemed";
    String actual = hashTable.find("mean");
    assertEquals("tests find method",expected, actual);
  }

  @Test
  public void testFindOfNotExistsWithCollision(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    hashTable.add("mean", "Mhemed");
    String actual = hashTable.find("mena");
    assertNull("tests find method", actual);
  }

  @Test
  public void testContainsOfExists(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    boolean actual = hashTable.contains("name");
    assertTrue("tests contains method",actual);
  }

  @Test
  public void testContainsOfNotExists(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    String expected = "AbdalQader";
    boolean actual = hashTable.contains("name2");
    assertFalse("tests contains method",actual);
  }

  @Test
  public void testContainsOfExistsWithCollision(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    hashTable.add("mean", "Mhemed");
    boolean actual = hashTable.contains("mean");
    assertTrue("tests contains method",actual);
  }

  @Test
  public void testContainsOfNotExistsWithCollision(){
    HashTable hashTable = new HashTable(10);
    hashTable.add("name", "AbdalQader");
    hashTable.add("mean", "Mhemed");
    boolean actual = hashTable.contains("mena");
    assertFalse("tests contains method",actual);
  }

  @Test
  public void testIndexInRange(){
    HashTable hashTable = new HashTable(10);
    int index = hashTable.getHash("this key has an index in the range of 0 to 9");
    assertTrue("test index in range", index >= 0 && index <= 9);
  }
}
