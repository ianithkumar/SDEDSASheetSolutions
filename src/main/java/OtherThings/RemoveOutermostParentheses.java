package OtherThings;

public class RemoveOutermostParentheses {
  static {
    for(int i=0;i<500;i++) {
      removeOutermostParentheses("");
    }
  }
  public static void main(String[] args) {
    String s = "(()())(())";
    String result = removeOutermostParentheses(s);
    System.out.println(result);
  }

  private static String removeOutermostParentheses(String s) {
    StringBuilder temp = new StringBuilder();
    int opened = 0;

    for(char c : s.toCharArray()) {
      if(c == '(' && opened++ > 0) temp.append(c);
      if(c == ')' && opened-- > 1) temp.append(c);
    }
    return temp.toString();
  }
}
