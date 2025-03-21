package ArraysPart1;

public class SetMatrixZero {
  public static void main(String[] args) {
//    int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {0, 1, 1}};
//    int[][] resultantMatrix = setMatrixZero(matrix);
    //int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    int[][] matrix = {{1},{0}};
    int[][] resultantMatrix = setMatrixZeroOptimalSolution(matrix);
    for (int[] row : resultantMatrix) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }

  private static int[][] setMatrixZero(int[][] matrix) {
    int[] rows = new int[matrix.length];
    int[] columns = new int[matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          rows[i] = 1;
          columns[j] = 1;
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (rows[i] == 1 || columns[j] == 1) {
          matrix[i][j] = 0;
        }
      }
    }
    return matrix;
  }

  private static int[][] setMatrixZeroOptimalSolution(int[][] matrix){
    int col0 = -1;

    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){

        if(matrix[i][j]==0) {
          matrix[i][0] = 0;

          if (j == 0) {
            col0 = 0;
          } else {
            matrix[0][j] = 0;
          }
        }
      }
    }

    for(int i=1;i<matrix.length;i++){
      for(int j=1;j<matrix[0].length;j++){
        if(matrix[i][0]==0 || matrix[0][j]==0){
          matrix[i][j] = 0;
        }
      }
    }
    if(matrix[0][0]==0){
      for(int i=1;i<matrix[0].length;i++){
        matrix[0][i] = 0;
      }

    }
    if(col0 == 0){
      for(int i=0;i<matrix.length;i++){
        matrix[i][0] = 0;
      }
    }

    return matrix;
  }
}
