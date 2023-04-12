public class ReplaceAllExample {

  public static void main(String args[]) {
    String s1 =
      "My name is Akshad. My name is Mint. My name is Akshuu.";
    String replaceString = s1.replaceAll("is", "was"); //replaces all occurrences of "is" to "was"

    System.out.println(replaceString);
  }
}
