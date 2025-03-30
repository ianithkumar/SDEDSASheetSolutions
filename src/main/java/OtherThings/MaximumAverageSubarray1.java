package OtherThings;

public class MaximumAverageSubarray1 {
  public static void main(String[] args) {
    int[] nums = {1,12,-5,-6,50,3};
    int k = 4;

    System.out.println(maximumAverageSubarray(nums,k));
  }
  private static double maximumAverageSubarray(int[] nums,int k){
    double max = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      int sum = 0;
      if((nums.length-i)>=k){
        for(int j=i;j<i+k;j++){
          sum+=nums[j];
        }
        max = Math.max((double)sum/k,max);
      }
    }
    return max;
  }
}
