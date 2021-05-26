package codes.app.src.main.hashtable;

import java.util.Arrays;

public class HashTable {
  public LinkedList[] arr;
  private int size;

  public HashTable(int size){
    this.size = size;
    arr = new LinkedList[size];
    for(int i=0; i<size; i++){
      arr[i] = new LinkedList();
    }
  }

  public int getHash(String key){
    int index = 0;
    for(int i=0; i < key.length(); i++){
      index += (int)key.charAt(i);
    }
    index %= size;
    return index;
  }


  public void add(String key, String value){
    Node pair = new Node(key + ":" + value);
    int index = getHash(key);
    arr[index].append(pair);
  }

  public String find(String key){
    int index = getHash(key);
    if(!arr[index].isEmpty()){
      Node current = arr[index].head;
      while(current != null){
        if(current.value.contains(key))
          return current.value.split(":")[1];
        current = current.next;
      }
    }
    return null;
  }

  public boolean contains(String key){
    int index = getHash(key);
    if(!arr[index].isEmpty()){
      Node current = arr[index].head;
      while (current != null){
        if(current.value.contains(key))
          return true;
        current = current.next;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    Node current;
    for(int i=0; i<arr.length; i++){
      result.append("Bucket ").append(i).append(": ").append("[");
      current = arr[i].head;
      while(current != null){
        result.append("{").append(current.value).append("}");
        if (current.next != null)
          result.append(" -> ");
        current = current.next;
      }
      result.append("]").append("\n");
    }
    return result.toString();
  }
}
