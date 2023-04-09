package com.akshad;

import java.util.Scanner;

public class CaseChecker {

  public static void main(String[] args) {
    //Q. Check whether the alphabet is lowercase or uppercase.
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word or alphabet to check case-");
    char ch = in.next().trim().charAt(0);
    if (ch >= 'a' && ch <= 'z') {
      System.out.println("Lower-Case");
    } else {
      System.out.println("Upper-Case");
    }
  }
}
