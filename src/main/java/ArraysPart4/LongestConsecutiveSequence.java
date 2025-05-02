package ArraysPart4;

public class LongestConsecutiveSequence {
  public static void main(String[] args) {
    int[] arr = {5, 100, 4, 200, 1, 3, 2};
    System.out.println(longestConseccutive(arr));
  }

  private static int longestConseccutive(int[] arr) {
    int currentLength;
    int maxLength = Integer.MIN_VALUE;

    for (int i : arr) {
      currentLength = 1;
      while (arrayContains(arr, i + 1)) {
        i = i + 1;
        currentLength++;
      }
      maxLength = Math.max(maxLength, currentLength);
    }
    return maxLength;
  }

  private static boolean arrayContains(int[] arr, int val) {
    for (int i : arr) {
      if (i == val) {
        return true;
      }
    }
    return false;
  }
}
