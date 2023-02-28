package com.akshad;

public class CountingOccurences {
    public static void main(String[] args) {
//        Q.Counting occurences
        int n = 88551525;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
