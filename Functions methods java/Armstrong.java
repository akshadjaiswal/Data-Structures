public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is armstrong or not-");
//        int n = in.nextInt();
//        System.out.println(IsArmstrong(n));

        for (int i = 100; i < 1000; i++) {
            if (IsArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean IsArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
