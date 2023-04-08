import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Enter the string to check whether it is palindrome or not."
    );
    String str = sc.nextLine();
    System.out.println(palindrome(str));
  }

  static boolean palindrome(String str) {
    if (str == null || str.length() == 0) {
      return true;
    }
    str = str.toLowerCase();
    for (int i = 0; i <= str.length() / 2; i++) {
      int start = str.charAt(i);
      int end = str.charAt(str.length() - 1 - i);

      if (start != end) {
        return false;
      }
    }
    return true;
  }
}
