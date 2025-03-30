package ArraysPart3;

public class PowerOfXandN {
  public static void main(String[] args) {
    double x = 2.0000;
    int n = 10;
    //System.out.println(powerOfXAndN(x,n));
    System.out.println(optimalSolution(x,n));
  }
  private static double powerOfXAndN(double x,int n){
    return (double) Math.pow(x,n);
  }
  private static double optimalSolution(double x, int n){
    double ans = 1.0;
    long nn = n;

    if(nn<0) nn = nn * (-1);
    while(nn>0){
      if(nn%2==1){
        ans = ans*x;
        nn = nn - 1;

      } else{
        x = x*x;
        nn = nn / 2;
      }
    }
    if(n<0) ans = (double)1.0 / (double)ans;

    return ans;
  }
}
