package ArraysPart2;

import java.util.Arrays;

public class FindDuplicateNumber {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,2};
    //System.out.println(findDuplicateNumber(arr));
    System.out.println(findDuplicateNumberOptimizedSolution(arr));
  }
  private static int findDuplicateNumber(int[] arr){
    Arrays.sort(arr);
    for(int i=1;i< arr.length;i++){      //Time Complexity = O(NlogN + N);
      if(arr[i]==arr[i-1]){
        return arr[i];
      }
    }
    return 0;
  }
  private static int findDuplicateNumberOptimizedSolution(int[] nums){
    int slow = nums[0];
    int fast = nums[0];

    do{
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while(slow!=fast);

    fast = nums[0];

    while(slow!=fast){
      slow = nums[slow];
      fast = nums[fast];
    }

    return slow;
  }
}
