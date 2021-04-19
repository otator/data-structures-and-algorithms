package codes.app.src.main.utilites;

public class AnimalShelterDemo {
  public static void main(String[] args){
    AnimalShelter shelter = new AnimalShelter();

    shelter.enqueue("dog");
    shelter.enqueue("cow");
    shelter.enqueue("mouse");
    shelter.enqueue("cat");
    shelter.enqueue("donkey");
    shelter.enqueue("giraffe");
    System.out.println(shelter.dequeue(""));
//    System.out.println(shelter.dequeue("dog"));
//    System.out.println(shelter.dequeue("cow"));
//    System.out.println(shelter.dequeue("giraffe"));
//    System.out.println(shelter.dequeue("donkey"));
//    System.out.println(shelter.dequeue("mouse"));
//    System.out.println(shelter.dequeue("mouse"));
    System.out.println(shelter);
  }
}
