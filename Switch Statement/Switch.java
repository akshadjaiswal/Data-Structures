import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the any fruit from - mango,apple,orange,cherry");
        String fruit = in.next();

        switch (fruit) {
            case ("mango"):
                System.out.println("King of the fruit");
                break;
            case ("apple"):
                System.out.println("Doctor recommended");
                break;
            case ("orange"):
                System.out.println("Sweet fruit");
                break;
            case ("cherry"):
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Enter Valid fruit");
                break;
        }

    }
}