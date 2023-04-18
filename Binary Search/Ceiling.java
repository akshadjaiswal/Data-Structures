public class Ceiling {

  public static void main(String[] args) {
    //find ceiling-find smallest number>=target
    int[] arr = { -1, 2, 3, 5, 9, 14, 16, 18 };
    int target = 15;
    int ans = ceiling(arr, target);
    System.out.println(ans);
  }

  static int ceiling(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    //find middle element
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        //Ans found
        return mid;
      }
    }
    return start;
  }
}
