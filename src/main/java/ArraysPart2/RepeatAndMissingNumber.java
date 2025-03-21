package ArraysPart2;

import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumber {
  public static void main(String[] args) {
    List<Integer> A = new ArrayList<>();
    A.add(1);
    A.add(3);
    A.add(4);
    A.add(2);
    A.add(2);

    List<Integer> result = repeatAndMissingNumber(A);
    System.out.println(result);
  }
  private static List<Integer> repeatAndMissingNumber(List<Integer> A){
    long n = A.size();
    long sn = (n*(n+1))/2;
    long s2n = (((n*(n+1))*(2*n+1))/6);

    long s = 0;
    long s2 = 0;
    for(int i=0;i<n;i++){
      s+=A.get(i);
      s2+= ((long) A.get(i) * A.get(i));
    }

    long val1 = s-sn;
    long val2 = s2-s2n;

    val2 = val2/val1;
    int x = (int)(val1+val2)/2;
    int y = (int)val2-x;

    ArrayList<Integer> result = new ArrayList<>();
    result.add(x);
    result.add(y);

    return result;
  }
}

//Mathematical Representation:

//[1,3,4,2,2]   ==> Result = [2,5]
//
//
//Assume:
//x = repeating
//    y = missing
//
//
//s-sn
//s2-s2n
//
//    s = 1+3+4+2+2 = 12
//sn = 1+2+3+4+5 = 15
//s-sn = 12-15 = -3
//
//s2 = 34
//s2n = 55
//s2-s2n = -21
//
//
//x-y = -3
//
//x2-y2 = -21
//    (x-y)(x+y) = -21
//
//x+y = -21/-3
//x+y = 7
//
//x-y = -3
//x+y = 7
//----------
//2x  = 4
//x = 2;(Repeating)
//
//x+y = 7
//
//2+y = 7
//y = 7-2
//y = 5(Missing)

