package ArraysPart3;

/*Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

    0 <= i < j < nums.length and
nums[i] > 2 * nums[j]. */

import java.util.ArrayList;

public class ReversePairs {
  private static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  public static int countPairs(int[] arr, int low, int mid, int high) {
    int right = mid + 1;
    int cnt = 0;
    for (int i = low; i <= mid; i++) {
      while (right <= high && arr[i] > 2L * arr[right]) right++;
      cnt += (right - (mid + 1));
    }
    return cnt;
  }

  public static int mergeSort(int[] arr, int low, int high) {
    int cnt = 0;
    if (low >= high) return cnt;
    int mid = (low + high) / 2 ;
    cnt += mergeSort(arr, low, mid);
    cnt += mergeSort(arr, mid + 1, high);
    cnt += countPairs(arr, low, mid, high);
    merge(arr, low, mid, high);
    return cnt;
  }

  public static int reversePairs(int[] arr) {
    int n = arr.length;
    return mergeSort(arr, 0, n - 1);
  }

  public static void main(String[] args) {
//    int[] arr = {1,3,2,3,1};
    int[] arr = {2,4,3,5,1};
    System.out.println(reversePairs(arr));
  }
}
