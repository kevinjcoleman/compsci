import java.util.*;

public class ScannerMultiply {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("What are your two favorite numbers? Type them seperated by spaces:  ");
    int num1 = console.nextInt();
    int num2 = console.nextInt();
    int product = num1 * num2;
    System.out.println(product + " is the product of your numbers!");
  }
}
