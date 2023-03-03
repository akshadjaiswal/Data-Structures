import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 46};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;//if you make a change in a object via this reference variable,same object will be change
    }

}
