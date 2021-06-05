package codes.app.src.main.utilites;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnimalShelter {

  //test  AnimalShelter class

  @Test
  public void testEmptyShelter(){
    AnimalShelter shelter = new AnimalShelter();
    assertNull(shelter.dequeue("cat"));
  }

  @Test
  public void testOneAnimalShelter(){
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue("cat");
    String expected = "cat";
    assertEquals("test dequeue from shelter with one animal", expected, shelter.dequeue("cat"));
  }

  @Test
  public void testNotFoundAnimalInShelter(){
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue("cat");
    shelter.enqueue("cat");
    shelter.enqueue("cat");
    shelter.enqueue("cat");
    assertNull(shelter.dequeue("dog"));
  }

  @Test
  public void testAddAnimalsInShelter(){
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue("cat");
    shelter.enqueue("dog");
    shelter.enqueue("dog");
    shelter.enqueue("cat");
    shelter.enqueue("dog");
    shelter.enqueue("cat");
    shelter.enqueue("dog");
    shelter.enqueue("dog");
    shelter.enqueue("dog");
    shelter.enqueue("dog");
    String expected ="front ➔ {cat} ➔ {dog} ➔ {dog} ➔ {cat} ➔ {dog} ➔ {cat} ➔ {dog} ➔ {dog} ➔ {dog} ➔ {dog} ➔ rear";
    assertEquals("tests add many cats and dogs into the shelter",expected, shelter.toString());
  }

  @Test
  public void testAddDifferentAnimalsInShelter(){
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue("dog");
    shelter.enqueue("cow");
    shelter.enqueue("mouse");
    shelter.enqueue("cat");
    shelter.enqueue("donkey");
    shelter.enqueue("giraffe");
    shelter.enqueue("cat");
    String expected ="front ➔ {dog} ➔ {cat} ➔ {cat} ➔ rear";
    assertEquals("tests add different animals rather that cats and dogs into the shelter",expected, shelter.toString());
  }

  @Test
  public void testGetDifferentAnimalsFromShelter(){
    AnimalShelter shelter = new AnimalShelter();
    shelter.enqueue("dog");
    shelter.enqueue("cat");
    shelter.enqueue("cat");
    assertNull(shelter.dequeue("monkey"));
  }

}
