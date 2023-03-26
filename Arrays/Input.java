import java.util.Arrays;
import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //array of primitives
    int[] arr = new int[5];
    arr[0] = 5;
    arr[1] = 55;
    arr[2] = 555;
    arr[3] = 5555;
    arr[4] = 55555;
    System.out.println(arr[4]);

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(arr)); //print using arrays to string class

    for (int i = 0; i < arr.length; i++) { //print using for loop
      System.out.print(arr[i] + " ");
    }
    //enhanced for loop
    for (int num : arr) { //for every element of the array print the array
      System.out.print(num + " "); //num represent the element of the array
    }

    //        System.out.println(arr[5]); //Index out of bound error

    //array of objects
    String str[] = new String[5];
    for (int i = 0; i < str.length; i++) {
      str[i] = in.next();
    }
    System.out.println(Arrays.toString(str));
    //modify
    str[0] = "Akshad";
    System.out.println(Arrays.toString(str));
  }
}
