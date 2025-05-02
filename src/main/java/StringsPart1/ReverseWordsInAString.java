package StringsPart1;

public class ReverseWordsInAString {
  public static void main(String[] args) {
//    String str = "the sky is blue";
    String str = "  hello world  ";
    System.out.println(reverseWordsInAString(str));
    System.out.println(otherSolution(str));
  }

  private static String reverseWordsInAString(String str) {
    String[] strArray = str.split("\\s+");  // ("\\s+")-->It splits the words which has 2 of more spaces.

    StringBuilder result = new StringBuilder();

    for (int i = strArray.length - 1; i >= 0; i--) {
      result.append(strArray[i]);
      result.append(" ");
    }
    return result.toString().trim();
  }

  private static String otherSolution(String str) {
    String result = "";
    String temp = "";
    str = str.trim();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch != ' ') {
        temp += ch;
      } else if (ch == ' ') {
        if (!result.equals("")) {
          result = temp + " " + result;
        } else {
          result = temp;
        }
        temp = "";
      }
    }

    if (!temp.equals("")) {
      if (!result.equals("")) {
        result = temp + " " + result;
      } else {
        result = temp;
      }
    }
    return result;
  }
}
