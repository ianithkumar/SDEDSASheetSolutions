package LinkedListAndArrays;

public class MaxConsecutiveOnes {
  public static void main(String[] args) {
    int[] arr = {1,1,0,1,1,1};
    System.out.println(maxConsecutiveOnes(arr));
  }
  private static int maxConsecutiveOnes(int[] arr){
    int maxLen = 0;
    int count = 0;
    for(int i=0;i<arr.length;i++) {
      if(arr[i]==1){
        count++;
      } else{
        count = 0;
      }
      maxLen = Math.max(maxLen,count);
    }
    return maxLen;
  }
}
