//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Solution {
     static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        //find middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}