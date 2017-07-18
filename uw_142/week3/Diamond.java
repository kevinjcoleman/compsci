public class Diamond {
  public static final int SIZE = 10;

  public static void main(String[] args) {
    draw();
  }

  public static void draw() {
    top();
    bottom_triangle();
    bottom_line();
  }

  public static void top() {
    int length = (6 * SIZE);
    for (int i=1; i <= length; i++) {
      draw_char(" ", (length - i));
      System.out.print("/");
      draw_char("*", i - 1);
      draw_char("|", 1);
      draw_char(" ", i - 1);
      System.out.print("\\");
      draw_char(" ", (i - 1));
      System.out.println();
    }
  }

  public static void bottom_triangle() {
    int length = (3 * SIZE);
    for (int i=length; i >= 1; i--) {
      int inner_size = i + (2 * SIZE) + SIZE - 1;
      draw_char(" ", (length - i));
      System.out.print("\\");
      draw_char("*", inner_size);
      draw_char("|", 1);
      draw_char(" ", inner_size);
      System.out.print("/");
      draw_char(" ", (i - 1));
      System.out.println();
    }
  }

  public static void bottom_line() {
    draw_char(" ", (3 * SIZE));
    for (int i=1; i <= (6 * SIZE); i++) {
      System.out.print("-");
    }
    draw_char(" ", (3 * SIZE));
    System.out.println();
  }

  public static void draw_char(String character, int numberOfTimes) {
    for (int i=1; i <= numberOfTimes; i++) {
      System.out.print(character);
    }
  }
}
