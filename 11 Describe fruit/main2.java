import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the any fruit from - mango,apple,orange,cherry");
        String fruit = in.next();

        switch (fruit) {
            case ("mango") -> System.out.println("King of the fruit");
            case ("apple") -> System.out.println("Doctor recommended");
            case ("orange") -> System.out.println("Sweet fruit");
            case ("cherry") -> System.out.println("Small fruit");
            default -> System.out.println("Enter Valid fruit");
        }

    }
}