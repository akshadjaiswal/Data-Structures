package com.akshad;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        //Q.Create a simple calculator program with addition , substractions, multiplication,dividation and modulus.
        System.out.println("Calculator Program");
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
        System.out.println("Enter operation (+,-,*,/,%)");
        //taking operator as a input
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            //taking input of two number
            System.out.println("Enter two number-");
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                if (num1 > 0) {
                    ans = num1 / num2;
                }
            }
            if (op == '%') {

                ans = num1 % num2;
            }
            } else if (op == 'x' || op == 'X') {
               break;
            } else {
                System.out.println("Invalid Output");
            }
            System.out.println(ans);
        }
    }
}
