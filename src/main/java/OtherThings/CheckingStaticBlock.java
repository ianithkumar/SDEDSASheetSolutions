package OtherThings;

public class CheckingStaticBlock {
  static int value;

  static{
    value = 42;
    System.out.println("Static block is executed. Value initialized to " + value);
  }
  public static void main(String[] args) {
    System.out.println("Main method starts.");
    System.out.println("Value: " + value);
  }
}
