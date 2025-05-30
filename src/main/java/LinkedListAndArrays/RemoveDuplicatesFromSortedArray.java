package LinkedListAndArrays;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    int[] arr = {0,0,1,1,1,2,2,3,3};    // result = 4 ==> {0,1,2,3}-> size:4
    System.out.println(removeDuplicateFromSortedArray(arr));
  }
  private static int removeDuplicateFromSortedArray(int[] arr) {
    if(arr.length==1){
      return 1;
    }
    int index = 1;

    for(int i=1;i<arr.length;i++){
      if(arr[i]!=arr[i-1]){
        arr[index++] = arr[i];
      }
    }
    return index;
  }
}
