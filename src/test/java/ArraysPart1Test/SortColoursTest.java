package ArraysPart1Test;

import ArraysPart1.SortColours;
import org.junit.Assert;
import org.junit.Test;

public class SortColoursTest {

  @Test
  public void testCase1() {
    int[] arr = {2, 1, 0, 1, 1, 2, 2, 0, 0, 0};
    int[] arrResult = SortColours.sortColours(arr);
    int[] arrExpectedResult = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2};
    Assert.assertArrayEquals(arrResult, arrExpectedResult);
  }

  @Test
  public void testCase2() {
    int[] arr1 = {2, 2, 2, 1, 1, 1, 0, 0, 0};
    int[] arr1Result = SortColours.sortColours(arr1);
    int[] arr1ExpectedResult = {0, 0, 0, 1, 1, 1, 2, 2, 2};
    Assert.assertArrayEquals(arr1Result, arr1ExpectedResult);
  }
}
