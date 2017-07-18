import java.awt.*; // so I can use Graphics
public class Circles {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(500, 350);
      panel.setBackground(Color.CYAN);
      Graphics g = panel.getGraphics();
      circle(100, 10, 0, 0, g);
      circle(100, 10, 130, 25, g);
      circle(60, 6, 260, 0, g);
      circle(80, 4, 360, 50, g);
      box(48, 4, 3, 10, 170, g);
      box(24, 2, 5, 180, 200, g);
      box(72, 9, 2, 330, 170, g);
   }

   public static void circle(int width, int circles, int xPosition, int yPosition, Graphics g) {
      int circle_difference = width / circles;
      for (int i = 0; i <= circles; i++) {
         int circle_dimensions = width - i * circle_difference;
         int circleXPposition =  xPosition + i * circle_difference / 2;
         int circleYPposition =  yPosition + i * circle_difference / 2;
         g.setColor(Color.BLACK);
         g.fillOval(circleXPposition, circleYPposition, circle_dimensions, circle_dimensions);
         g.setColor(Color.YELLOW);
         g.fillOval(circleXPposition + 1, circleYPposition + 1, circle_dimensions - 2, circle_dimensions -2);
      }
   }

   public static void box(int circleSize, int circles, int rowColumns, int xPosition, int yPosition, Graphics g) {
      g.setColor(Color.BLACK);
      int square_width = (rowColumns * circleSize);
      g.fillRect(xPosition, yPosition, square_width, square_width);
      g.setColor(Color.GREEN);
      g.fillRect(xPosition + 1, yPosition+ 1, square_width - 2, square_width - 2);
      // add circle row
      for (int j=0; j < rowColumns; j++) {
         int circleYPposition = yPosition + (j * circleSize);
         // add circle circle columns
         for (int i=0; i < rowColumns; i++) {
            int circleXPposition = xPosition + (i * circleSize);
            circle(circleSize, circles, circleXPposition, circleYPposition, g);
         }
      }
      // draw criss-crossing lines
      g.setColor(Color.BLACK);
      g.drawLine(xPosition, yPosition, xPosition + square_width, yPosition + square_width);
      g.drawLine(xPosition, yPosition + square_width, xPosition + square_width, yPosition);
   }
}
