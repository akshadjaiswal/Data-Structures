package com.akshad;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Q.Find a reverse of a number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int num = in.nextInt();
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
