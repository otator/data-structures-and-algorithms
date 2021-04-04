class ArrayReverse{
  public static void main(String[] args){
    int [] arr = {1, 2, 3, 4, 5, 6};
    arr = reverseArray(arr);
    for(int i: arr){
      System.out.print(i+ " ");
    }
    System.out.println();

    int [] arr2 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                   61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131,
                   137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

    arr2 = reverseArray(arr2);
    for(int i: arr2){
      System.out.print(i+ " ");
    }
    System.out.println();


  }
  public static int[] reverseArray(int[] arr){
    int size = arr.length;
    int [] newArray = new int[size];
    int index = 0;
    for(int i=size-1; i>=0; i--) {
      newArray[index] = arr[i];
      index++;
    }
    return newArray;
  }
}
