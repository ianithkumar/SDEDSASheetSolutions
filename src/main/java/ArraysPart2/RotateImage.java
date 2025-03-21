package ArraysPart2;

public class RotateImage {
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] rotatedMatrix = rotateImage(matrix);

    for(int[] row:rotatedMatrix){
      for(int col:row){
        System.out.print(col+" ");
      }
      System.out.println();
    }
  }
  private static int[][] rotateImage(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
      for(int j=i;j<matrix[i].length;j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length/2;j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix[i].length-j-1];
        matrix[i][matrix[i].length-j-1] = temp;
      }
    }
    return matrix;
  }
}
