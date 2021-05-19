package codes.app.src.main.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMerge {
  @Test
  public void testArray(){
    int[] arr = {8,4,23,42,16,15};
    int expected = 42;
    MergeSort.merge(arr);
    assertEquals("test the last element of the sorted array which must be 42", expected, arr[5]);
  }

  @Test
  public void testReverseSortedArray(){
    int[] arr = {20,18,12,8,5,-2};
    int expected = -2;
    MergeSort.merge(arr);
    assertEquals("test the first element of the sorted array which must be -2", expected, arr[0]);
  }

  @Test
  public void testFewUniquesArray(){
    int[] arr = {5,12,7,5,5,7};
    int expected = 7;
    MergeSort.merge(arr);
    assertEquals("test the middle element of the sorted array which must be 7", expected, arr[3]);
  }

  @Test
  public void testNearlySortedArray(){
    int[] arr = {2,3,5,7,13,11};
    int expected = 13;
    MergeSort.merge(arr);
    assertEquals("test the last element of the sorted array which must be 13", expected, arr[5]);
  }
}
