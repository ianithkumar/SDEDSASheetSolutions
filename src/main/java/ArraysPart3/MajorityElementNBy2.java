package ArraysPart3;

public class MajorityElementNBy2 {
  public static void main(String[] args) {
//    int[] arr = {2,2,1,1,1,1,1,2,2};
    int[] arr = {3, 3, 4};
//    System.out.println(majorityElementNBy2(arr));
    System.out.println(majorityElement2(arr));
  }

  private static int majorityElementNBy2(int[] arr) {
    int majority = 0;
    int result = 0;

    for (int n : arr) {
      if (majority == 0) {
        result = n;
      }
      majority += (n == result) ? 1 : -1;
    }
    return result;
  }

  private static int majorityElement2(int[] nums) {
    int element = 0;
    int count = 0;
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      if (count == 0) {
        element = nums[i];
        count++;
      } else if (nums[i] == element) {
        count++;
      } else {
        count--;
      }
    }

    int count1 = 0;
    for (int n : nums) {
      if (n == element) {
        count1++;
      }
    }
    if (count1 > (len / 2)) {
      return element;
    }
    return -1;
  }
}
