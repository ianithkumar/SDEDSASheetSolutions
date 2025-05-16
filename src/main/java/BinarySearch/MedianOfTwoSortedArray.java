package BinarySearch;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
  public static void main(String[] args) {
    int[] arr1 = {1, 2};
    int[] arr2 = {3, 4};  //{1,2,3,4} ==> 2+3/2 = 2.5
    System.out.println(medianOfTwoSortedArray(arr1, arr2));
  }

  private static double medianOfTwoSortedArray(int[] arr1, int[] arr2) {
    int n = arr1.length;
    int m = arr2.length;
    int[] mergedArray = new int[n + m];
    int index = 0;
    for (int i = 0; i < n; i++) {
      mergedArray[index] = arr1[i];
      index++;
    }
    for (int i = 0; i < m; i++) {
      mergedArray[index] = arr2[i];
      index++;
    }

    Arrays.sort(mergedArray);
    int mergedArraySize = mergedArray.length;
    if (mergedArraySize % 2 == 1) {
      return (double) mergedArray[mergedArraySize / 2];
    } else {
      int firstMedian = mergedArray[mergedArraySize / 2 - 1];
      int secondMedian = mergedArray[mergedArraySize / 2];
      return ((double) firstMedian + (double) secondMedian) / 2;
    }
  }
}
