import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = {55, 58, 88, 96, -52};
        System.out.print("Enter the element to search- ");
        int target = in.nextInt();
        boolean ans = linearSearch2(num, target);
        System.out.println(ans);
    }

    //search the target and return true or false
    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
//         run for loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

//for returning a index
//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        return -1;
//    }
}