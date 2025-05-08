package OtherThings;

import java.util.Arrays;

public class MaximumGap164 {
  public static void main(String[] args) {
    int[] arr = {1,1,1,1,1,5,5,5,5,5};
    System.out.println(maximumGap(arr));
  }
  private static int maximumGap(int[] nums) {
    if(nums.length==1) {
      return 0;
    }
    Arrays.sort(nums);

    if(nums.length==2) {
      return nums[1] - nums[0];
    }

    int max = Integer.MIN_VALUE;

    for(int i=1;i<nums.length;i++) {
      max = Math.max(max,(nums[i]-nums[i-1]));
    }
    return max;
  }
}
