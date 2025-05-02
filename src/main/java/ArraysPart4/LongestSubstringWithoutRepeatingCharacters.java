package ArraysPart4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    String str = "abcabcbb";
//    String str = "bbbbb";
//    String str = "pwwkew";
//    String str = "au";
    System.out.println(longestSubstringWithoutRepeatingCharacters(str));
  }

  private static int longestSubstringWithoutRepeatingCharacters(String str) {
    if (str.isEmpty()) {
      return 0;
    }
    if (str.length() == 1) {
      return 1;
    }
    int maxLen = Integer.MIN_VALUE;
    for (int i = 0; i < str.length(); i++) {
      Set<Character> s = new HashSet<>();
      for (int j = i; j < str.length(); j++) {
        if (s.contains(str.charAt(j))) {
          maxLen = Math.max(maxLen, j - i);
          break;
        }
        s.add(str.charAt(j));
      }
    }
    return maxLen;
  }

  private static int optimisedSolutionOne(String str) {
    if (str.length() == 0) return 0;
    int maxans = Integer.MIN_VALUE;
    Set<Character> set = new HashSet<>();
    int l = 0;
    for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
    {
      if (set.contains(str.charAt(r))) //if duplicate element is found
      {
        while (l < r && set.contains(str.charAt(r))) {
          set.remove(str.charAt(l));
          l++;
        }
      }
      set.add(str.charAt(r));
      maxans = Math.max(maxans, r - l + 1);
    }
    return maxans;
  }


  private static int optimisedSolutionTwo(String str) {
    HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();

    int left = 0, right = 0;
    int n = str.length();
    int len = 0;
    while (right < n) {
      if (mpp.containsKey(str.charAt(right))) left = Math.max(mpp.get(str.charAt(right)) + 1, left);

      mpp.put(str.charAt(right), right);

      len = Math.max(len, right - left + 1);
      right++;
    }
    return len;
  }
}
