package ArraysPart3;
/*There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.
Given the two integers m and n,
return the number of possible unique paths that the robot can take to reach the bottom-right corner. */


public class GridUniquePaths {
  public static void main(String[] args) {
    int m = 3;
    int n = 2;
    System.out.println(uniquePaths(m,n));
  }
  public static int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        dp[i][j] = -1;
      }
    }
    return countPaths(0,0,m,n,dp);
  }
  private static int countPaths(int i,int j,int m,int n,int[][] dp){
    if(i==m-1 && j==n-1) return 1;
    if (i>=m||j>=n) return 0;
    if(dp[i][j] != -1) return dp[i][j];
    else return dp[i][j] = countPaths(i+1,j,m,n,dp) + countPaths(i,j+1,m,n,dp);
  }
}
