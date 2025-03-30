package ArraysPart2;

/*A pair ('ARR[i]', 'ARR[j]') is said to be an inversion when:

1. 'ARR[i] > 'ARR[j]'
2. 'i' < 'j'

Sample Input 1 :
3
3 2 1
Sample Output 1 :
3
Explanation of Sample Output 1:
We have a total of 3 pairs which satisfy the condition of inversion. (3, 2), (2, 1) and (3, 1).*/

import java.util.ArrayList;

public class CountInversion {
  public static void main(String[] args) {
    int[] arr = {3,2,1};
    System.out.println(countInversion(arr));
  }
  private static int countInversion(int[] arr){
    int resultantCount = mergeSort(arr,0,arr.length-1);
    return resultantCount;
  }

  private static int mergeSort(int[] arr,int l,int r){
    int count = 0;
    if(l<r) {
      int mid = (l + r) / 2;
      count += mergeSort(arr, l, mid);
      count += mergeSort(arr, mid + 1, r);
      count += merge(arr, l, mid, r);
    }
    return count;
  }

  private static int merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    int count = 0;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        count += (mid - left + 1);
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

    return count;
  }
}
