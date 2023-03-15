import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(999);
        fun("JUICE WRLD");
        int ans = sum(1, 2);
        int ans2 = sum(1, 2, 2);
        System.out.println(ans);
        System.out.println(ans2);
        jw(999);
        jw("JUICE WRLD");
    }
    //Functions
    static void jw(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void jw(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("First one-");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one-");
        System.out.println(name);

    }
}
