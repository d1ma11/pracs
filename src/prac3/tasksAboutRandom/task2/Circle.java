package tasksAboutRandom.task2;

import java.util.Random;

public class Circle {
    Random rand = new Random();

    Point pt = new Point(0, 0);
    double R;
    double L;

    public Circle() {
        this.R = rand.nextDouble();
        this.L = 2 * Math.PI * R;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "L = " + L +
                ", R = " + R + '}';
    }
}
