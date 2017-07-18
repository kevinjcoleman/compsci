import java.util.*;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How old are you? ");
    int age = console.nextInt();
    int years = 65 - age;
    System.out.println(years + " years until retirement!");
  }
}
