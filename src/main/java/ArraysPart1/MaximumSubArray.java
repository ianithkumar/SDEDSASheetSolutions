package ArraysPart1;

public class MaximumSubArray {
  public static void main(String[] args) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maximumSubArray(arr));
  }
  private static int  maximumSubArray(int[] arr) {
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for(int i=0;i<arr.length;i++){
      sum+=arr[i];

      if(sum>max){
        max = sum;
      }
      if(sum<0){
        sum = 0;
      }
    }

    return max;
  }
}
