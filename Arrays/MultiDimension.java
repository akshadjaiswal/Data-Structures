import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

  public static void main(String[] args) {
    // 2D Arrays
    //Q:Printing a matrix
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the elements of the matrix-");
    int arr[][] = new int[3][3];
    //input
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = in.nextInt();
      }
    }
    //output by double for loop
    //        for (int row = 0; row < arr.length; row++) {
    //            for (int col = 0; col < arr[row].length; col++) {
    //                System.out.print(arr[row][col] + " ");
    //            }
    //            System.out.println();
    //        }
    //output using simple for loop with the help of Arrays.toString method
    //        for (int row = 0; row < arr.length; row++) {
    //            System.out.println(Arrays.toString(arr[row]));
    //        }
    //output using enhanced for loop
    for (int[] a : arr) {
      System.out.println(Arrays.toString(a));
    }
  }
}
