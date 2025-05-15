package ArraysPart4;

import java.util.HashMap;

public class LengthOfTheLongestSubarrayWithZeroSum {
  public static void main(String[] args) {
    int[] arr = {9, -3, 3, -1, 6, -5}; // result = 5 ==> {-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
//    int[] arr = {6, -2, 2, -8, 1, 7, 4, -10}; // result = 8 ==> {-2, 2}, {-8, 1, 7}, {-2, 2, -8, 1, 7}, {6, -2, 2, -8, 1, 7, 4, -10}
    System.out.println(lengthOfTheLongestSubarrayWithZeroSum(arr));
    System.out.println(optimalSolution(arr));
  }

  private static int lengthOfTheLongestSubarrayWithZeroSum(int[] arr) {
    int maxLen = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum += arr[j];
        if (sum == 0) {
          maxLen = Math.max(maxLen, j - i + 1);
        }
      }
    }
    return maxLen;
  }

  private static int optimalSolution(int[] arr) {
    HashMap<Integer, Integer> prefixSum = new HashMap<>();
    int sum = 0;
    int maxLen = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == 0) {
//        maxLen = Math.max(maxLen, i + 1);
        maxLen = i + 1;
      } else {
        if(prefixSum.get(sum)!= null){
          maxLen = Math.max(maxLen, i-prefixSum.get(sum));
        } else {
          prefixSum.put(sum,i);
        }
      }
    }
    return maxLen;
  }
}
