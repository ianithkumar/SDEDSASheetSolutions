package ArraysPart1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
  public static void main(String[] args) {
    int noOfRows = 1;
    List<List<Integer>> pascalsTriangle = pascalsTriangle(noOfRows);

    System.out.println(pascalsTriangle);
  }

  private static List<List<Integer>> pascalsTriangle(int n) {
    List<List<Integer>> resultantTriangle = new ArrayList<>();

    resultantTriangle.add(new ArrayList<>());
    resultantTriangle.add(new ArrayList<>());

    if (n == 1) {
      resultantTriangle.getFirst().add(1);
      return resultantTriangle;
    }
    resultantTriangle.get(0).add(1);
    resultantTriangle.get(1).add(1);
    resultantTriangle.get(1).add(1);

    for (int i = 2; i < n; i++) {
      resultantTriangle.add(new ArrayList<>());
      resultantTriangle.get(i).add(1);

      for (int j = 1; j < i; j++) {
        resultantTriangle.get(i).add(resultantTriangle.get(i - 1).get(j - 1) + resultantTriangle.get(i - 1).get(j));
      }
      resultantTriangle.get(i).add(1);
    }
    return resultantTriangle;
  }
}
