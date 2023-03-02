import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee ID-1,2,3");
        int EmpID = in.nextInt();
        System.out.println("Enter department - IT,Mg");
        String department = in.next();
//        switch (EmpID) {
//            case (1):
//                System.out.println("Akshad Jaiswal");
//                break;
//            case (2):
//                System.out.println("Jayesh Hande");
//                break;
//            case (3):
//                switch (department) {
//                    case ("IT"):
//                        System.out.println("IT department");
//                        break;
//                    case ("Mg"):
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department");
//                }
//                break;
//            default:
//                System.out.println("Enter valid employee id");
//        }

        //Enhanced switch statement and better way to write
        switch (EmpID) {
            case (1) -> System.out.println("Akshad Jaiswal");
            case (2) -> System.out.println("Jayesh Hande");
            case (3) -> {
                System.out.println("Kunal Mirgal");
                switch (department) {
                    case ("IT") -> System.out.println("IT department");
                    case ("Mg") -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter valid employee  id");
        }

    }
}
