package ArraysPart2;

import java.util.Arrays;

public class MergeTwoSortedArrays {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,0,0,0};
    int[] arr2 = {2,5,6};
    int m = 3;
    int n = 3;

    System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1,m,arr2,n)));
  }
  private static int[] mergeTwoSortedArrays(int[] arr1, int m, int[] arr2, int n) {
    int index = 0;
    for(int i=m;i<arr1.length;i++){
      arr1[i] = arr2[index++];
    }

    Arrays.sort(arr1);
    return arr1;
  }
}

