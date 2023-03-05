import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        //Q; Is 4 is present between given range;
        Scanner in = new Scanner(System.in);
        int[] arr2 = {1, 2, 3, 4, 5, 6, 52, 55, 58, 595};
        System.out.print("Enter the element to search-");
        int target = in.nextInt();
        ;
        System.out.print("Enter the initial range-");
        int start = in.nextInt();
        System.out.print("Enter the final range- ");
        int end = in.nextInt();
        boolean ans = linear(arr2, target, start, end);
        System.out.println(ans);
    }

    static boolean linear(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = start; index <= end; index++) {
            if (target == arr[index]) {
                return true;
            }
        }
        return false;
    }
}
