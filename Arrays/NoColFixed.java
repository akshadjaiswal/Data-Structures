public class NoColFixed {

  public static void main(String[] args) {
    //printing an matrix when the size of coloumn not fixed.
    int arr[][] = { { 1, 2, 3 }, { 1, 2 }, { 1, 2, 3, 4 } };
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
  }
}
