import java.util.Arrays;
public class ArrayShift{
  public static void main(String[] args){

    //test the insertShiftArray() method using testInsertShiftMethod()
    testInsertShiftMethod();
  }

  public static int[] insertShiftArray(int[] arr, int n){
    int size = arr.length;
    int[] newArray = new int[size+1];
    int middle;
    if(size%2==0)
      middle = size/2;
    else
      middle = size/2 +1;

    for(int i=0; i<middle; i++){
      newArray[i] = arr[i];
    }
    newArray[middle] = n;
    for(int i=middle; i<arr.length; i++){
      newArray[i+1] = arr[i];
    }
    return newArray;
  }

  public static void testInsertShiftMethod(){
    int[] arr = {2,4,6,8};
    int[] expected = {2, 4, 5, 6, 8};
    int n =5;
    int[] actual = insertShiftArray(arr, n);
    int[] empty = new int[0];
    int[] expected2 = {4};
    System.out.println("Expected array: " + Arrays.toString(expected) + " and the actual is: " +Arrays.toString(actual)+ " and this method should return 'true' :-> "+compareTwoArrays(expected,actual));
    System.out.println("Expected array: " + Arrays.toString(expected) + " and the actual is: " +Arrays.toString(insertShiftArray(arr,99))+" and this method should return 'false' :-> "+compareTwoArrays(expected,insertShiftArray(arr,99)));
    System.out.println("Expected array: " + Arrays.toString(expected2) + " and the actual is: " +Arrays.toString(insertShiftArray(empty,4))+" and this method should return 'true' :-> "+compareTwoArrays(expected2,insertShiftArray(empty,4)));

  }
  public static boolean compareTwoArrays(int[] arr1, int[] arr2){
    if(arr1.length != arr2.length)
      return false;
    for(int i=0; i<arr1.length; i++){
      if(arr1[i] != arr2[i])
        return false;
    }
    return true;
  }
}
