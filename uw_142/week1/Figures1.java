public class Figures1 {
  public static void main(String[] args) {
    egg();
    teacup();
    stopsign();
    hat();
  }

  public static void top() {
    System.out.println("  ______");
    System.out.println(" /      \\ ");
    System.out.println("/        \\ ");
  }

  public static void bottom() {
    System.out.println("\\        /");
    System.out.println(" \\______/");
  }

  public static void line() {
    System.out.println("+--------+");
  }

  public static void egg() {
    top();
    bottom();
    System.out.println();
  }

  public static void teacup() {
    bottom();
    line();
    System.out.println();
  }

  public static void stopsign() {
    top();
    System.out.println("|  STOP  |");
    bottom();
    System.out.println();
  }

  public static void hat() {
    top();
    line();
  }

}
