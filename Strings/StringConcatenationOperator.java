import java.util.ArrayList;

public class StringConcatenationOperator {

  public static void main(String[] args) {
    System.out.println('a' + 'b'); //getting ascii values of a and b
    System.out.println("a" + "b"); //print two strings in  ""
    System.out.println('a' + 3);
    System.out.println((char) ('a' + 3));
    System.out.println("a" + 1);
    //after few steps it will same as "a"+"1"
    //Integer will convert to Integer that will call toString() method
    System.out.println("Akshad" + new ArrayList<>());
    System.out.println("Akshad" + new Integer(999)); //depricated
    String ans = new Integer(999) + " " + new ArrayList<>();
    System.out.println(ans);
  }
}
