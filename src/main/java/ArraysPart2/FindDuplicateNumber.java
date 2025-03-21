package ArraysPart2;

import java.util.Arrays;

public class FindDuplicateNumber {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,2};
    System.out.println(findDuplicateNumber(arr));
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
}
