package BinarySearch;
/*You are given a sorted array consisting of only integers where every element appears exactly twice,
except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.*/

public class SingleElementInASortedArray {
  public static void main(String[] args) {
    int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
    System.out.println(singleElementInASortedArray(arr));
  }

  private static int singleElementInASortedArray(int[] nums) {
    int n = nums.length;
    if (n == 1) return nums[n - 1];
    if (nums[0] != nums[1]) return nums[0];
    if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

    int left = 0;
    int right = n - 1;

    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) return nums[mid];
      if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) left = mid + 1;
      if ((mid % 2 == 0 && nums[mid] == nums[mid - 1]) || (mid % 2 == 1 && nums[mid] == nums[mid + 1])) right = mid;
    }
    return 0;
  }
}
