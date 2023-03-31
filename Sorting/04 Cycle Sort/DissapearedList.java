import java.util.ArrayList;
import java.util.List;

public class DissapearedList {

  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1, 9, 11 };
    System.out.println(findDisappearedNumbers(nums));
  }

  static List<Integer> findDisappearedNumbers(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if (nums[i] != nums[correct]) {
        swap(nums, i, correct);
      } else {
        i++;
      }
    }
    //finding disappeared numbers
    List<Integer> ans = new ArrayList<>();
    for (int Index = 0; Index < nums.length; Index++) {
      if (nums[Index] != Index + 1) {
        ans.add(Index + 1);
      }
    }
    return ans;
  }

  static void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }
}
