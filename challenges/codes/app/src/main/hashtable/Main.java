package codes.app.src.main.hashtable;

public class Main {
  public static void main(String [] args){
    HashTable hashTable = new HashTable(10);
    String key = "name";
    System.out.println(hashTable.getHash(key));
    hashTable.add(key, "AbdalQader");
    hashTable.add("naem","Abd");
    System.out.println(hashTable.find("name2222222222222222"));
    System.out.println(hashTable);
  }
}
