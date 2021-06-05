package codes.app.src.main.leftjoin;

import codes.app.src.main.hashtable.HashLinkedList;
import codes.app.src.main.hashtable.HashNode;
import codes.app.src.main.hashtable.HashTable;

public class LeftJoin {
  public static void main(String[] args) {
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

    HashTable hashTable = leftJoin(hashTable1, hashTable2);
    System.out.println(hashTableBuckets(hashTable));
  }

  public static HashTable leftJoin(HashTable hashTable1, HashTable hashTable2){
    HashTable hashTable = new HashTable(10);
    for(int i=0; i<hashTable1.getSize(); i++){
      addEquals(hashTable1.arr[i], hashTable2.arr[i], hashTable);
    }
    return hashTable;
  }

  public static void addEquals(HashLinkedList list1, HashLinkedList list2, HashTable hashTable){
    HashNode current1 = list1.head;
    HashNode current2 = list2.head;
    String key1="";String key2="";String value1="";String value2="";
    while(current1 != null){
      key1 = current1.value.split(":")[0];
      value1 = current1.value.split(":")[1];
      if (current2 != null){
        key2 = current2.value.split(":")[0];
        value2 = current2.value.split(":")[1];
      }
      if(key1.equals(key2)){
        hashTable.add(key1, value1+", " + value2);
      }else{
        hashTable.add(key1, value1+", " + "Null");
      }
      current1 = current1.next;
      if (current2!=null)
        current2 = current2.next;
    }
  }

  public static String hashTableBuckets(HashTable hashTable){
    StringBuilder result = new StringBuilder();
    HashNode current;
    for(int i=0; i<hashTable.arr.length; i++){
      current = hashTable.arr[i].head;
      while(current != null){
        result.append("Bucket ").append(i).append(": ").append("[");
        result.append("{").append(current.value).append("}");
        if (current.next != null)
          result.append(" -> ");
        current = current.next;
        result.append("]").append("\n");
      }
    }
    return result.toString();
  }
}
