package LinkedListAndArrays;

import com.sun.security.jgss.GSSUtil;

public class TrappingRainWater {
  public static void main(String[] args) {
//    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    int[] height = {4,2,0,3,2,5};
    System.out.println(trappingRainWater(height));
    System.out.println(optimalSolution(height));
  }
  private static int trappingRainWater(int[] height) {
    int maxWater = 0;
    int n = height.length;

    for(int i=1;i<n;i++) {
      int leftMax = 0;
      int rightMax = 0;
      for(int j=0;j<=i;j++) {
        leftMax = Math.max(leftMax,height[j]);
      }
      for(int k=n-1;k>=i;k--) {
        rightMax = Math.max(rightMax,height[k]);
      }

      maxWater += Math.min(leftMax,rightMax) - height[i];
    }
    return maxWater;
  }
  private static int optimalSolution(int[] height) {
    int n = height.length;
    int[] prefixMax = new int[n];
    int[] suffixMax = new int[n];
    prefixMax[0] = height[0];
    suffixMax[n-1] = height[n-1];

    int maxWater = 0;

    for(int i=1;i<n;i++) {
      prefixMax[i] = Math.max(height[i],prefixMax[i-1]);
    }
    for(int i=n-2;i>=0;i--) {
      suffixMax[i] = Math.max(height[i],suffixMax[i+1]);
    }

    for(int i=1;i<n;i++) {
      maxWater += Math.min(prefixMax[i],suffixMax[i]) - height[i];
    }
    return maxWater;
  }
}
