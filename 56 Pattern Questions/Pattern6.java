public class Pattern6 {

  public static void main(String[] args) {
    pattern(5);
  }

  static void pattern(int n) {
    for (int row = 0; row < 2 * n; row++) {
      int TotalNoOfColoumns = row > n ? 2 * n - row : row;
      int TotalNoOfSpaces = n - TotalNoOfColoumns;
      for (int s = 0; s < TotalNoOfSpaces; s++) {
        System.out.print(" ");
      }
      for (int col = 0; col < TotalNoOfColoumns; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
