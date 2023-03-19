import java.util.Scanner;
class main2{
    public static void main(String args[]){
        int x,y;
        System.out.println("Enter x and y");
        Scanner in=new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();
        //Before swapping values of x and y
        System.out.println("Before Swapping\nx="+x+"\ny="+y);

        x=x+y;
        y=x-y;
        x=x-y;
        //After swapping values
        System.out.println("After Swapping Swapping\nx="+x+"\ny="+y);
    }
}