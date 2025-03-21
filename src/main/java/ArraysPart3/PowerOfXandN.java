package ArraysPart3;

public class PowerOfXandN {
  public static void main(String[] args) {
    double x = 2.0000;
    int n = 10;
    System.out.println(powerOfXAndN(x,n));
  }
  private static double powerOfXAndN(double x,int n){
    return (double) Math.pow(x,n);
  }
}
