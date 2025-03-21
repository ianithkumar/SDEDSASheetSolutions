package ArraysPart1;

public class BestTimeToBuyAndSellStock {
  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    System.out.println(maxProfit(prices));
  }
  public static int maxProfit(int[] prices) {
    int soFarMinimum = prices[0];
    int maxProfit = 0;

    for(int i=1;i<prices.length;i++){
      if(prices[i]<soFarMinimum){
        soFarMinimum = prices[i];
      } else{
        int profit = prices[i] - soFarMinimum;
        maxProfit = Math.max(maxProfit,profit);
      }
    }
    return maxProfit;
  }
}
