import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();
        // int ans=sum2();
        int ans=sum3(50,60);
        System.out.println(ans);
    }

    //pass the value of number when you are calling the method from main
    static int sum3(int a, int b) {
        int ans = a + b;
        return ans;
    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number-");
        int num1=in.nextInt();
        System.out.print("Enter the second number-");
        int num2=in.nextInt();
        int sum=num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number-");
        int num1=in.nextInt();
        System.out.print("Enter the second number-");
        int num2=in.nextInt();
        int sum=num1 + num2;
        System.out.println("Sum is "+sum);
    }
}