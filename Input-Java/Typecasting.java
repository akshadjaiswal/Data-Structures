import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        //typecasting
        int num = (int)(54.25f); //It will covert the integer in to the float
        System.out.println(num);

        //example
        // byte a = 40;
        // byte b =50;
        // byte c = 100;
        // int d = a*b/c;
        // System.out.println(d);

        //if we have multiple -datatypes then the result is in the bigger one
        // eg - float + int -short = double
        //eg- byte*byte/integer=integer 
    }
}