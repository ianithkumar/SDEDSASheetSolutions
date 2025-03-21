package ArraysPart2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
  public static void main(String[] args) {
//    int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
    int[][] intervals = {{1,4},{4,5}};
    int[][] mergedIntervals = mergeOverlappingIntervals(intervals);

    for(int[] nums:mergedIntervals){
      for(int num:nums){
        System.out.print(num+" ");
      }
      System.out.println();
    }
  }
  private static int[][] mergeOverlappingIntervals(int[][] intervals){
    List<List<Integer>> mergedIntervals = new ArrayList<>();

    Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

    for(int i=0;i<intervals.length;i++){
      if(mergedIntervals.isEmpty() || (intervals[i][0]>mergedIntervals.get(mergedIntervals.size()-1).get(1))){
        mergedIntervals.add(Arrays.asList(intervals[i][0],intervals[i][1]));
      }

      else{
        mergedIntervals.get(mergedIntervals.size()-1).set(1,Math.max(intervals[i][1],mergedIntervals.get(mergedIntervals.size()-1).get(1)));
      }
    }

    int size = mergedIntervals.size();
    int[][] result = new int[size][2];

    for(int i=0;i<size;i++){
      for(int j=0;j<2;j++){
        result[i][j] = mergedIntervals.get(i).get(j);
      }
    }

    return result;
  }
}
