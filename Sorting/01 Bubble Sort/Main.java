import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 3, 1, 5, 4, 2 };
    bubble(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void bubble(int[] arr) {
    //run steps n-1 times
    for (int i = 0; i < arr.length; i++) {
      //for each steps max item will come at last index
      for (int j = 1; j <= arr.length - 1; j++) {
        //Swap if the item is smaller than the previous item
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }
}
