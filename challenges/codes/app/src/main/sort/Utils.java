package codes.app.src.main.sort;

public class Utils {
  public static void printArray(int [] arr){
    System.out.println();
    System.out.print("[");
    for(int i: arr){
      if(i != arr[arr.length-1])
        System.out.print(i + ", ");
      else
        System.out.print(i);
    }
    System.out.print("]");
  }
}
