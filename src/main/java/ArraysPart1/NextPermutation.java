package ArraysPart1;

public class NextPermutation {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    int[] nextPermutation = nextPermutation(arr);
    for(int n:nextPermutation){
      System.out.print(n+" ");
    }
  }
  private static int[] nextPermutation(int[] arr){
    int breakPoint = -1;
    int n = arr.length;

    for(int i=n-2;i>=0;i--){
      if(arr[i]<arr[i+1]){
        breakPoint = i;
        break;
      }
    }

    if(breakPoint == -1){
      return reverse(arr,0,arr.length-1);
    }

    for(int i=n-1;i>=breakPoint;i--){
      if(arr[i]>arr[breakPoint]){
        swap(arr,i,breakPoint);
        break;
      }
    }

    arr = reverse(arr,breakPoint+1,n);
    return arr;
  }
  private static int[] reverse(int[] arr,int left,int right){
    while(left<right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
    return arr;
  }
  private static int[] swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    return arr;
  }
}
