import java.awt.*; // so I can use Graphics
public class Drawing {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(600, 600);
      Graphics g = panel.getGraphics();
      int ball1x = 100, ball1y = 0, v01 = 25;
      int ball2x = 200, ball2y = 100, v02 = 15;
      // draw the balls at each time increment
      for (double t = 0; t <= 10.0; t = t + 0.1) {
         double disp1 = displacement(v01, t, 9.81);
         g.fillOval(ball1x, ball1y + (int) disp1, 10, 10);
         double disp2 = displacement(v02, t, 9.81);
         g.fillOval(ball2x, ball2y + (int) disp2, 10, 10);
         panel.sleep(50); // pause for 50 ms
         panel.clear();
      }
   }

    public static double displacement(double v0, double a, double t) {
       double d = v0 * t + 0.5 * a * Math.pow(t, 2);
       return d;
    }
}
