public class Shadowing {
    static int x = 40;//this will be shadowed at the line 8

    public static void main(String[] args) {
        System.out.println(x);//40
        int x;//the class variable at line 2 will be shadowed by this
        x = 90;
        System.out.println(x);//90
        fun();//40
    }

    static void fun() {
        System.out.println(x);
    }
}
