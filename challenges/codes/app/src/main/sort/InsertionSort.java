package codes.app.src.main.sort;

public class InsertionSort {
  public static void main(String[] args){
    int [] arr = {8,4,23,42,16,15};
    Utils.printArray(arr);
    Utils.printArray(insertionSort(arr));

  }

  public static int[] insertionSort(int[] arr){
    int j, temp;
    for(int i=1; i<arr.length; i++){
      j = i-1;
      temp = arr[i];
      while(j >= 0 && temp < arr[j]){
        arr[j+1] = arr[j];
        j-=1;
        arr[j+1] = temp;
      }
    }
    return arr;
  }
}
