package codes.app.src.main.leftjoin;

import codes.app.src.main.hashtable.HashTable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLeftJoin {
  //-------------------------------- test hash table left join ------------------------------------------//

  @Test
  public void testHashTable1(){
    HashTable hashTable1 = new HashTable(10);
    hashTable1.add("fond", "enamored");
    hashTable1.add("wrath", "anger");
    hashTable1.add("diligent", "employed");
    hashTable1.add("outfit", "grab");
    hashTable1.add("guide", "usher");
    HashTable hashTable2 = new HashTable(10);
    hashTable2.add("fond", "averse");
    hashTable2.add("wrath", "delight");
    hashTable2.add("diligent", "idle");
    hashTable2.add("guide", "follow");
    hashTable2.add("flow", "jam");
    HashTable hashTable = LeftJoin.leftJoin(hashTable1, hashTable2);
    String expected = "anger, delight";
    assertEquals("test left join on hash tables", expected, hashTable.find("wrath"));
  }
  @Test
  public void testHashTable2(){
    HashTable hashTable1 = new HashTable(10);
    hashTable1.add("fond", "enamored");
    hashTable1.add("wrath", "anger");
    hashTable1.add("diligent", "employed");
    hashTable1.add("outfit", "grab");
    hashTable1.add("guide", "usher");
    HashTable hashTable2 = new HashTable(10);
    hashTable2.add("fond", "averse");
    hashTable2.add("wrath", "delight");
    hashTable2.add("diligent", "idle");
    hashTable2.add("guide", "follow");
    hashTable2.add("flow", "jam");
    HashTable hashTable = LeftJoin.leftJoin(hashTable1, hashTable2);
    String expected = "grab, Null";
    assertEquals("test left join on hash tables", expected, hashTable.find("outfit"));
  }

  @Test
  public void testHashTable3(){
    HashTable hashTable1 = new HashTable(10);
    hashTable1.add("fond", "enamored");
    hashTable1.add("wrath", "anger");
    hashTable1.add("diligent", "employed");
    hashTable1.add("outfit", "grab");
    hashTable1.add("guide", "usher");
    HashTable hashTable2 = new HashTable(10);
    HashTable hashTable = LeftJoin.leftJoin(hashTable1, hashTable2);
    String expected = "Bucket 0: [{wrath:anger, Null}]\n" +
      "Bucket 3: [{fond:enamored, Null}]\n" +
      "Bucket 6: [{guide:usher, Null}]\n" +
      "Bucket 7: [{outfit:grab, Null}]\n" +
      "Bucket 8: [{diligent:employed, Null}]\n";
    assertEquals("test left join on hash tables", expected, LeftJoin.hashTableBuckets(hashTable));

  }
}
