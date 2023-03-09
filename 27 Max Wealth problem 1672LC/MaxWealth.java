//https://leetcode.com/problems/richest-customer-wealth/
class MaxWealth {
    public int maximumWealth(int[][] accounts) {
       int ans = Integer.MIN_VALUE;
       //Enhanced for loop 
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) ans = sum;
        }
        return ans;
    }
}