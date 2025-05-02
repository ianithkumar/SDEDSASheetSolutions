package BinarySearch;

public class SearchInARotatedArray {
  public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 0, 1, 2};
    int target = 6;
    System.out.println(searchInARotatedArray(arr, target));
  }

  private static int searchInARotatedArray(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[left] <= nums[mid]) {
        if (nums[left] <= target && nums[mid] >= target) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (nums[mid] <= target && nums[right] >= target) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
