package ArraysPart3;

public class SearchIn2DMatrix {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 13, 14}};
    int target = 13;
    System.out.println(searchInMatrix(matrix, target));
  }

  private static boolean searchInMatrix(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;

    int low = 0;
    int high = (n * m) - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      int row = mid / m;
      int col = mid % m;
      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return false;
  }
}
