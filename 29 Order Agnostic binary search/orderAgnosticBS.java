//when the array is sorted but you dont know where it is ascending or descending then it order agnostic search will find the order
public class OrderAgnosticBS {
    public static void main(String[] args) {
        //Ascending array arr
        int[] arr = {1, 2, 4, 6, 7, 9, 10, 15, 22, 37};
        //Descending array arr2
        int[] arr2 = {100, 85, 62, 61, 55, 42, 39, 37, 28, 22, 19, 8, 1};
        //target element
        int target = 19;
        int ans = orderAgnosticBS(arr2, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //to find whether the array is ascending or descending 
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            //finding the middle element
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;

    }
}
