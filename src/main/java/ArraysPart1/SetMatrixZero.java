package ArraysPart1;

public class SetMatrixZero {
  public static void main(String[] args) {
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    int[][] resultMatrix = setMatrixZero(matrix);
    for (int[] row : resultMatrix) {
      for (int value : row) {
        System.out.print(value+" ");
      }
      System.out.println();
    }
  }
  private static int[][] setMatrixZero(int[][] matrix){
    int[] rows = new int[matrix.length];
    int[] columns = new int[matrix[0].length];

    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==0){
          rows[i] = 1;
          columns[j] = 1;
        }
      }
    }

    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        if(rows[i]==1 ||columns[j]==1){
          matrix[i][j] = 0;
        }
      }
    }
    return matrix;
  }
}
