package codes.app.src.main.hashtable;


public class HashTable {
  public HashLinkedList[] arr;
  private int size;

  public HashTable(int size){
    this.size = size;
    arr = new HashLinkedList[size];
    for(int i=0; i<size; i++){
      arr[i] = new HashLinkedList();
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
    String pair = key + ":" + value;
    int index = getHash(key);
    arr[index].appendWithUpdate(pair);
  }

  public String find(String key){
    int index = getHash(key);
    if(!arr[index].isEmpty()){
      HashNode current = arr[index].head;
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
      HashNode current = arr[index].head;
      while (current != null){
        if(current.value.contains(key))
          return true;
        current = current.next;
      }
    }
    return false;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    HashNode current;
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
