public class SmallestLetter {
    public static void main(String[] args) {
        //find ceiling-find smallest number>=target
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char ans = smallestLetter(letters, target);
        System.out.println(ans);
    }

    static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        //find middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

