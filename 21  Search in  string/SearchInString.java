import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Akshad";
        System.out.println("Enter the character to search in the string");
        char target = in.next().trim().charAt(0);
        System.out.println(SearchInString(name, target));

    }

    static boolean SearchInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }
        //for each loop
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
