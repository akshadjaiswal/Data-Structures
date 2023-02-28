public class Problem {
    public static void main(String[] args) {
        
       //Q.Print number from 1 to 5
    

        // for (int num = 1; num <= 5; num++) {
        //     System.out.println(num);
        // }

        // Q.print number from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth value for printing a number");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }


}