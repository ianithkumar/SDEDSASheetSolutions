package StringsPart2;

public class CheckAnagram {
  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(checkAnagram(s,t));
  }
  private static boolean checkAnagram(String s,String t){
    int[] check = new int[26];

    for(char ch : s.toCharArray()){
      check[ch-'a']++;
    }

    for(char ch : t.toCharArray()){
      check[ch-'a']--;
    }

    for(int i=0;i<26;i++){
      if(check[i]!=0){
        return false;
      }
    }
    return true;
  }
}
