import java.util.Scanner;

public class Ww{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the any day in week by num - 1,2,3,4,5,6,7");
        int day=in.nextInt();
        switch (day) {
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):
                System.out.println("WeekDay");
                break;
            case (6):
            case (7):
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter valid day number");
                break;
        }
        //Enahanced switch statement
        /*
         switch (day) {
            case (1), (2), (3), (4), (5) -> System.out.println("WeekDay");
            case (6), (7) -> System.out.println("Weekend");
            default -> System.out.println("Enter valid day number");
        }
        */

    }
}