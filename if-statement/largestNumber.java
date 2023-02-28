package com.akshad;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
//        Q.Find maximum between three numbers
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // Logic section using if
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // method 2
//        int max=0;
//        if(a>b){
//            max=a;
//        }else{
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);

        //method 3 using math function
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
