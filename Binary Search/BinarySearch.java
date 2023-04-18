public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9,10, 15, 20, 22, 27};
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
       
        while (start <= end) {
             //find middle element
            // int mid= (start+end)/2; it might be possibilty that the valye of (start+end) may exceeds the range of the integer.
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}