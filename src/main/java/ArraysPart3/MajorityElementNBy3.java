package ArraysPart3;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementNBy3 {
  public static void main(String[] args) {
    int[] arr = {3,2,3};
    List<Integer> result = majorityElementNBy3(arr);
    System.out.println(result);
  }
  private static List<Integer> majorityElementNBy3(int[] arr){
    List<Integer> result = new ArrayList<>();

    int element1 = Integer.MIN_VALUE;
    int element2 = Integer.MIN_VALUE;
    int count1 = 0;
    int count2 = 0;
    int len = arr.length;

    for(int i=0;i<len;i++){
      if(count1==0 && arr[i]!=element2){
        element1 = arr[i];
        count1++;
      } else if(count2==0 && arr[i]!=element1){
        element2 = arr[i];
        count2++;
      } else if(arr[i]==element1){
        count1++;
      } else if(arr[i]==element2){
        count2++;
      } else{
        count1--;
        count2--;
      }
    }

    int countOne = 0;
    int countTwo = 0;

    for(int i=0;i<len;i++){
      if(arr[i]==element1){
        countOne++;
      } else if(arr[i]==element2){
        countTwo++;
      }
    }
    if(countOne>(len/3)){
      result.add(element1);
    }
    if(countTwo>(len/3)){
      result.add(element2);
    }

    return result;
  }
}
