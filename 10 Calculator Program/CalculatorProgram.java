package com.akshad;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        System.out.println("Calculator Program");
        System.out.println();
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
        System.out.println("Enter operation (+,-,*,/,%)");
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
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
