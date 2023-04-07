public class Comparision {

  public static void main(String[] args) {
    String a = "Akshad";
    String b = "Akshad";
    //==
    System.out.println(a == b);
    String name1 = new String("Akshad");
    String name2 = new String("Akshad");
    //System.out.println(name1==name2); //comparator
    System.out.println(name1.equals(name2)); //method
    System.out.println(name1.charAt(0));
  }
}
