package com.akshad;

import java.util.Scanner;

public class Solution2 {

  public static void main(String[] args) {
    //Q.Find maximum between three numbers
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    int max = 0;
    if (a > b) {
      max = a;
    } else {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    System.out.println(max);
  }
}
