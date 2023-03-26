import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the element to add");
    ArrayList<Integer> list = new ArrayList<>(10);
    //

    //        System.out.println(list.contains(1555));

    //        list.set(0,99);
    //        System.out.println(list);
    //        list.remove(2);
    //        System.out.println(list);

    for (int i = 0; i < 5; i++) {
      list.add(in.nextInt());
    }
    //get a item at any index
    for (int i = 0; i < 5; i++) {
      System.out.println(list.get(i) + " ");
    }
    System.out.println(list);
  }
}
