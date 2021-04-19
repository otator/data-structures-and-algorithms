package codes.app.src.main.utilites;

import codes.app.src.main.stacksandqueues.Node;
import sun.nio.cs.ext.MacArabic;

import java.util.Locale;

public class AnimalShelter {
  Node front;
  Node rear;
  public AnimalShelter() {
  }

  class Node{
    String animal;
    Node next;
    Node previous;

    public Node(String animal) {
      this.animal = animal;
      this.next = null;
      previous = null;
    }
  }

  public void enqueue(String animal){
    animal = animal.toLowerCase();
//     if the animal is not a dog or cat, do not add it into the shelter.
    if(!animal.equals("cat") && !animal.equals("dog")){
      return;
    }
    else{
      Node animalNode = new Node(animal);
      if(front == null){
        front = animalNode;
        rear = animalNode;
//        front.previous = rear;
      }
      else{
        rear.previous = animalNode;
        animalNode.next = rear;
        rear = animalNode;
      }
    }
  }

  public String dequeue(String pref){
    pref = pref.toLowerCase();
    if(front == null)
      return null;
    if(!pref.equals("dog") && !pref.equals("cat"))
      return null;

    else{
      Node temp = front;
      String prefAnimal = null;
      if(front.animal.equals(pref)){
        temp = front;
        front = front.previous;
        return temp.animal;
      }
//      while (!temp.previous.animal.equals(pref) && temp != rear){
        while (temp.previous!= null){
          if (temp.previous.animal.equals(pref))
            break;
        temp = temp.previous;
      }
      if(temp.previous != null) {
        prefAnimal = temp.previous.animal;
        temp.previous = temp.previous.previous;
      }
      return prefAnimal;
    }
  }


  @Override
  public String toString(){
    String result = "front ➔ ";
    Node current = front;
    while(current!= null){
      result+="{" + current.animal + "} ➔ " ;
      current = current.previous;
    }
    result+= "rear";
    return result;
  }

}
