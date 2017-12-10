public class Fractal1_2 {
  public static void main(String[] args) {

    //the 2nd and 3rd fract1 will only work if the snowflake aligns with the axes.

    fract1(0, 400, WIDTH, 500);
    fract1(0, 400, );
    fract1();
  }

  public static void fract1(double x1, double y1, double x2, double y2) {
    double length = (Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2)));
    double height = (Math.sqrt(3) / 2 * length / 3);

    System.out.println(length);
    System.out.println(height);

    double midLinex1 = x1 + (x2 - x1) / 3;
    double midLinex2 = x1 + 2 * (x2 - x1) / 3;

    double midLiney1 = y1 + (y2 - y1) / 3;
    double midLiney2 = y1 + 2 * (y2 - y1) / 3;

    double lineMiddlex = x1 + (x2 - x1) / 2;
    double lineMiddley = y1 + (y2 - y1) / 2;

    double triHeight = (Math.sqrt(3) / 2 * length / 3);

    double lineAngle = Math.asin((x2 - x1) / length);
    double myHeightAngle = Math.PI/2 - lineAngle;
    double ky = Math.cos(myHeightAngle) * height;
    double kx = Math.sin(myHeightAngle) * height;

    System.out.println(kx);
    System.out.println(ky);

    System.out.println(lineAngle);
    System.out.println(myHeightAngle);

    double triangleTopx = Math.abs(lineMiddlex + kx);
    double triangleTopy = Math.abs(lineMiddley - ky);
  }
}