//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {

  public static void main(String[] args) {
    int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
    int target = 10;
    System.out.println(ans(arr, target));
  }

  static int ans(int[] arr, int target) {
    //first find range
    //first start range with box of size 2
    int start = 0;
    int end = 1;
    //condition of target lie in range
    while (target > arr[end]) {
      int temp = end + 1; //this is our new start
      //double the box value
      //end=previous end +SizeofBox*2
      end = end + (end - start + 1) * 2;
      start = temp;
    }
    return binarySearch(arr, target, start, end);
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
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
    return -1;
  }
}
