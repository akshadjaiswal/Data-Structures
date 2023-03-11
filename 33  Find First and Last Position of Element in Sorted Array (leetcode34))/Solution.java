//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int Search(int[] nums, int target, boolean findIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        //find middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans=mid;
                if (findIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}