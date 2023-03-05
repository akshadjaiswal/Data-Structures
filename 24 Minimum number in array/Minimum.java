public class Minimum {
    public static void main(String[] args) {
        int[] num = {256, 96, 65, 470, 85, 252, 66, 99, 88, 254, 456, 542};
        System.out.println(min(num));
    }

    //assume that the length of givem array !=0
    //return the minimum
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
}
