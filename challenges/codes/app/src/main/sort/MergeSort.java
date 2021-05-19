package codes.app.src.main.sort;

import java.util.Arrays;

public class MergeSort {

  public static void main(String [] args){
    int [] arr = {8,4,23,42,16,15};
    Utils.printArray(arr);
    merge(arr);
    Utils.printArray(arr);

  }

  public static void merge(int [] arr) {
    int n = arr.length;
    if (n > 1) {
      int mid = n / 2;
      int[] left = Arrays.copyOfRange(arr, 0, mid);
      int[] right = Arrays.copyOfRange(arr, mid, n);
      merge(left);
      merge(right);
      merge(left, right, arr);
    }
  }

  public static void merge(int[] left, int[] right, int[] arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while(i < left.length && j < right.length){
      if(left[i] < right[j]){
        arr[k] = left[i];
        i+=1;
      }else {
        arr[k] = right[j];
        j+=1;
      }
      k+=1;
    }//while

    while(i<left.length){
      arr[k] = left[i];
      i+=1;
      k+=1;
    }

    while(j<right.length){
      arr[k] = right[j];
      j+=1;
      k+=1;
    }
  }
}
