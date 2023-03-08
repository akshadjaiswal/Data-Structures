//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
       System.out.println(findNumbers(nums));
        // System.out.println(digits(0));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function to check wether the number contains even digits or not.
    static boolean even(int num) {
        int numberOfDigits = digits2(num);
       /* if (numberOfDigits % 2 == 0) return true;
        else return false;*/
        return numberOfDigits % 2 == 0;
    }
    //optimized digit finfing method.
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
   /* count the number of the digit
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }*/
}
