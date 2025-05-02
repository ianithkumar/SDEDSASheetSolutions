package ArraysPart4;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] arr = {2, 7, 11, 15};
    int target = 9;

    System.out.println(Arrays.toString(twoSum(arr, target)));

    System.out.println(Arrays.toString(optimalSolution(arr, target)));
  }

  private static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          break;
        }
      }
    }
    return result;
  }

  private static int[] optimalSolution(int[] nums, int target) {
    HashMap<Integer, Integer> mpp = new HashMap<>();
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int moreNeeded = target - num;
      if (mpp.containsKey(moreNeeded)) {
        result[0] = mpp.get(moreNeeded);
        result[1] = i;
        break;
      }

      mpp.put(nums[i], i);
    }
    return result;
  }
}
