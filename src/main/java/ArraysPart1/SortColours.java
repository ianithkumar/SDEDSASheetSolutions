package ArraysPart1;

import java.util.Arrays;

public class SortColours {
  public static void main(String[] args) {
    int[] arr = {2,0,2,1,1,0};
    System.out.println(Arrays.toString(sortColours(arr)));
  }
  public static int[] sortColours(int[] nums) {
    int i=0;
    int j=nums.length-1;
    int k=0;

    while(k<=j){
      if(nums[k]==0){
        swap(nums,k,i);
        i++;
        k++;
      }
      else if(nums[k]==1){
        k++;
      }
      else{
        swap(nums,k,j);
        j--;
      }
    }
    return nums;
  }
  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }
}
