public class SpaceNeedle {
  public static final int NEEDLE_SIZE = 10;

  public static void main(String[] args) {
    draw();
  }

  public static void draw() {
    blank_spine(NEEDLE_SIZE);
    top_hat();
    line();
    bottom_hat();
    blank_spine(NEEDLE_SIZE);
    spine_with_elevator(NEEDLE_SIZE * NEEDLE_SIZE);
    top_hat();
    line();
  }

  public static void blank_spine(int length) {
    for (int i=1; i <= length; i++) {
      int spaces_needed = (NEEDLE_SIZE * 3);
      draw_char(" ", spaces_needed);
      draw_char("|", 2);
      draw_char(" ", spaces_needed);
      System.out.println();
    }
  }

  public static void spine_with_elevator(int length) {
    for (int i=1; i <= length; i++) {
      int spaces_needed = (NEEDLE_SIZE * 2 + 1);
      int elevator_spaces = (NEEDLE_SIZE - 2);
      draw_char(" ", spaces_needed);
      draw_char("|", 1);
      draw_char("%", elevator_spaces);
      draw_char("|", 2);
      draw_char("%", elevator_spaces);
      draw_char("|", 1);
      draw_char(" ", spaces_needed);
      System.out.println();
    }
  }

  public static void line() {
    System.out.print("|");
    draw_char("\"", NEEDLE_SIZE*6);
    System.out.println("|");
  }

  public static void top_hat() {
    for (int i=1; i <= NEEDLE_SIZE; i++) {
      int spaces_needed = (NEEDLE_SIZE * 3 - (3 * i));
      int stars_needed = (3 * i - 3);
      draw_char(" ", spaces_needed);
      System.out.print("__/");
      draw_char(":", stars_needed);
      draw_char("|", 2);
      draw_char(":", stars_needed);
      System.out.print("\\__");
      draw_char(" ", spaces_needed);
      System.out.println();
    }
  }

  public static void bottom_hat() {
    for (int i=NEEDLE_SIZE; i >= 1; i--) {
      int spaces_needed =  (NEEDLE_SIZE * 2 - (2 * i));
      int stars_needed = (i * 2 + (NEEDLE_SIZE - 1));
      draw_char(" ", spaces_needed);
      System.out.print("\\_");
      draw_char("/\\", stars_needed);
      System.out.print("_/");
      draw_char(" ", spaces_needed);
      System.out.println();
    }
  }

  public static void draw_char(String character, int numberOfTimes) {
    for (int i=1; i <= numberOfTimes; i++) {
      System.out.print(character);
    }
  }
}
