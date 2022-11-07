package prac2.task6;

public class Circle {
    private double x = 0.0;
    private double y = 0.0;
    private double r = 1.0;

    public Circle(double x, double y, double r) {

        this.x = x;
        this.y = y;
        if (r < 0) {
            System.out.println("Incorrect radius");
            System.exit(0);
        }
        this.r = r;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double circleArea() {
        return Math.PI * this.r * this.r;
    }

    public double circumferenceLength() {
        return 2 * Math.PI * this.r;
    }

    public void circleCheck(Circle secondCircle) {

        System.out.println(" ");
        if (this.circleArea() == secondCircle.circleArea()) {
            System.out.println("1. Areas match");
        } else System.out.println("1. Areas don't match");

        if (this.getX() == secondCircle.getX() && this.getY() == secondCircle.getY()) {
            System.out.println("2. Center coordinates match.");
        } else System.out.println("2. Center coordinates don't match.");

        if (this.getR() == secondCircle.getR()) {
            System.out.println("3. Radius match.");
        } else System.out.println("3. Radius don't match.");

        double d = Math.sqrt(Pow((this.getX() - secondCircle.getX()), 2) + Pow((this.getY() - secondCircle.getY()), 2));
        if (this.getR() + secondCircle.getR() > d) {
            System.out.println("4. Circumferences overlap.");
        } else System.out.println("4. Circumferences don't overlap.");

    }
    public void circleComparison(Circle secondCircle) {
        if (this.circleArea() == secondCircle.circleArea()) {
            System.out.println("Circumferences match.");
        } else System.out.print("Circumferences don't  match (not equal areas).");

    }
    public double Pow(double exp, int power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result = result * exp;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
