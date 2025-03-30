package OtherThings;

public class MaxNumberOfKSumPairs {
  public static void main(String[] args) {
    int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
    int k = 2;

    System.out.println(maxNumberOfKSumPairs(nums,k));
  }
  private static int maxNumberOfKSumPairs(int[] nums,int k){
    int count = 0;

    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[j]!=0 && nums[i]!=0 &&nums[i]+nums[j] == k){
          nums[i] = 0;
          nums[j] = 0;
          count++;
        }
      }
    }
    return count;
  }
}
