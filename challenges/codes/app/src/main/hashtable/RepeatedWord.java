package codes.app.src.main.hashtable;

import java.util.Locale;

public class RepeatedWord {
  public static void main(String[] args) {
    String text = "Once upon a time, there was a brave princess who...";
    System.out.println(getRepeatedWord(text));
    String text2 = "It was the best of times, it was the worst of times, " +
      "it was the age of wisdom, it was the age of foolishness, it was the epoch" +
      " of belief, it was the epoch of incredulity, it was the season of Light, it was" +
      " the season of Darkness, it was the spring of hope, it was the winter of despair," +
      " we had everything before us, we had nothing before us, we were all going direct " +
      "to Heaven, we were all going direct the other way – in short, the period was so far" +
      " like the present period, that some of its noisiest authorities insisted on its being" +
      " received, for good or for evil, in the superlative degree of comparison only...";
    System.out.println(getRepeatedWord(text2));

    String text3 = "It was a queer, sultry summer, the summer they electrocuted the " +
      "Rosenbergs, and I didn’t know what I was doing in New York...";
    System.out.println(getRepeatedWord(text3));

    String text4 = "I love you";
    System.out.println(getRepeatedWord(text4));

  }

  // this method returns the first repeated word if exists
  // else it returns null
  public static String getRepeatedWord(String str){
    if(str.length() == 0)
      return str;
    HashTable hashTable = new HashTable(127);
    String[] text = str.split(" ");
    for (String word : text) {
      if (isRepeated(hashTable, cleanWord(word.toLowerCase())))
        return word;
    }
    return null;
  }

  //this methods checks if a word already exists in the  hash table
  public static boolean isRepeated(HashTable hashTable, String word){
    if(!hashTable.contains(word)){
      hashTable.add(word, "1");
      return false;
    }
    else
      return true;
  }

  // this method removes punctuation marks from words.
  // ex: "summer," -> "summer"
  public static String cleanWord(String word){
    int length = word.length();
    return isLetter(word.charAt(length-1))? word: word.substring(0,length-1);
  }

  //checks whether a character is a letter or not
  public static boolean isLetter(char c){
    return ((int) c >= 65 && (int) c <=90) || ((int) c >= 97 && (int) c <=122);
  }
}
