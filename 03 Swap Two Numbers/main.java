public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swaping a="+a+ " b="+b);

        int temp=a;
        a=b;
        b = temp;
        System.out.println("After swaping a="+a+ " b="+b);
    }
}