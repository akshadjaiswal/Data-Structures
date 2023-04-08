import java.util.Arrays;

public class StringMethods {

  public static void main(String[] args) {
    String name = "Akshad and Mint where Akshad is a name and mint is nickname";
    System.out.println(Arrays.toString(name.toCharArray()));
    System.out.println(name.toLowerCase());
    System.out.println(name.indexOf('M'));
    System.out.println(name.strip());
    System.out.println(Arrays.toString(name.split(" ")));
  }
}
