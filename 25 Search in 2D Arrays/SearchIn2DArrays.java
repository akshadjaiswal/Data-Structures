import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        //Q. Check the given element is present in array or not.
        //Also print the array int matrix form.
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8}, {9, 10, 11, 12}};
        System.out.print("Enter the element to search-");
        int target = in.nextInt();

        System.out.println(search(arr, target));
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

    static boolean search(int[][] num, int target) {
        if (num.length == 0) {
            return false;
        }
        for (int[] ints : num) {
            for (int col = 0; col < ints.length; col++)
                if (ints[col] == target) {
                    return true;
                }
        }
        return false;
    }
}
