package LinkedListAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public static void main(String[] args) {
    int[] arr = {-1,0,1,2,-1,-4};
    System.out.println(threeSum(arr));
  }
  private static List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;

    Arrays.sort(nums);

    for(int i=0;i<n;i++) {
      if(i>0 && nums[i] == nums[i-1]) continue;

      int j = i+1;
      int k = n-1;
      while(j<k) {
        long sum = nums[i];
        sum += nums[j];
        sum+=nums[k];
        if(sum==0) {
          List<Integer> temp = new ArrayList<>();
          temp.add(nums[i]);
          temp.add(nums[j]);
          temp.add(nums[k]);
          result.add(temp);
          j++;
          k--;

          while(j<k && nums[j]==nums[j-1]) j++;
          while(j<k && nums[k]==nums[k+1]) k--;
        } else if(sum < 0) j++;
        else k--;
      }
    }
    return result;
  }
}
