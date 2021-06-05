package codes.app.src.main.java.codes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBinarySearchArray {
  @Test
  public void testArray(){
    int [] arr = {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
    int expectedIndex = 11;
    int value = 37;
    int actualIndex = BinarySearch.binarySearch(arr, value);
    assertEquals("test the value index of array with more than 10 values", expectedIndex, actualIndex);
  }
  @Test
  public void testLastIndexOfArray(){
    int [] arr = {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
    int expectedIndex = 16;
    int value = 59;
    int actualIndex = BinarySearch.binarySearch(arr, value);
    assertEquals("test the value index of array with more than 10 values", expectedIndex, actualIndex);
  }
  @Test
  public void testFirstIndexOfArray(){
    int [] arr = {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
    int expectedIndex = 0;
    int value = 1;
    int actualIndex = BinarySearch.binarySearch(arr, value);
    assertEquals("test the value index of array with more than 10 values", expectedIndex, actualIndex);
  }

  @Test
  public void testIndexOfOneArrayValue(){
    int [] arr = {5};
    int expectedIndex = 0;
    int value = 5;
    int actualIndex = BinarySearch.binarySearch(arr, value);
    assertEquals("test array with one value", expectedIndex, actualIndex);
  }

  @Test
  public void testIndexOfTwoArrayValues(){
    int [] arr = {11,99};
    int expectedIndex = 1;
    int value = 99;
    int actualIndex = BinarySearch.binarySearch(arr, value);
    assertEquals("test array with two values", expectedIndex, actualIndex);
  }

  @Test
  public void testEmpty(){
    int [] arr = {};
    int expectedIndex = -1;
    int value = 10;
    int actualIndex = BinarySearch.binarySearch(arr, value);
    assertEquals("test empty array must return -1", expectedIndex, actualIndex);
  }
  @Test
  public void testNotExists(){
    int [] arr = {2,4,6,8,10};
    int expectedIndex = -1;
    int value = 9;
    int actualIndex = BinarySearch.binarySearch(arr, value);
    assertEquals("test empty array must return -1", expectedIndex, actualIndex);
  }
}
