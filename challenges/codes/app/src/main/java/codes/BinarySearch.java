package codes.app.src.main.java.codes;

public class BinarySearch{
  public static void main(String[] args){
//    int [] arr = {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
//    int[] arr ={5};
    int [] arr = {2,4,6,8,10};
    System.out.println(binarySearch(arr ,9));
  }

  public static int binarySearch(int[] arr, int value){
    int mid;
    //if there is only one value
    if(arr.length == 1 && arr[0] == value)
      return 0;
    // if the array is more that one
    else if(arr.length > 1){
      //set the low to first index
      int low = 0;
      //set high to last index
      int high = arr.length -1;
      //left variable to check if the value to the right or the left
      // this variable used to get the first and the last elements.
      boolean left = false;
      //loop until the high and low became the same index
      while(high - low > 0){
        // assign the mid to be the middle index each iteration
        mid = (high - low) / 2 + low;
        // if the value in the middle return it
        if(arr[mid] == value){
          return mid;
        }
        // if the value is the last element will be returned in this else-if block
        else if(high - low == 1 && !left && arr[high] == value){
          return high;
        }
        // if the value is the first element will be returned in this else-if block
        else if(high - low == 1 && left && arr[low] == value) {
          return low;
        }
        else if(high - low == 1 && (arr[low] != value || arr[high]!=value)) {
          return -1;
        }
        // if the middle value is less than the value change the low to be the middle index
        else if(arr[mid] < value) {
          low = mid;
          // since this part in the right of the middle set the left to false
          left = false;
        }
        // if the middle value is less than the value assign the high to be the middle index
        else{
          high = mid;
          // since this part in the left of the middle set the left to true
          left = true;
        }
      }
    }
    //if the value not found or the array is empty return -1
    return -1;
  }
}
