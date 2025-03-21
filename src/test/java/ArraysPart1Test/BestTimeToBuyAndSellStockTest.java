package ArraysPart1Test;

import org.junit.Assert;
import org.junit.Test;
import ArraysPart1.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockTest {

  @Test
  public void testCase1(){
    int[] arr = {7,1,5,3,6,4};
    int arrResult = BestTimeToBuyAndSellStock.maxProfit(arr);
    int expectedResult = 5;
    Assert.assertEquals(arrResult,expectedResult);
  }


  @Test
  public void testCase2(){
    int[] arr = {7,6,4,3,1};
    int arrResult = BestTimeToBuyAndSellStock.maxProfit(arr);
    int expectedResult = 0;
    Assert.assertEquals(arrResult,expectedResult);

  }
}
