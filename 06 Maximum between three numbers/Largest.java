package com.akshad;

import java.util.Scanner;

public class Largest {

  public static void main(String[] args) {
    //Q.Find maximum between three numbers
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    // Logic section using if
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    System.out.println(max);
  }
}
