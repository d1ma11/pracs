package prac2.task6;

public class CircleTest {
    public static void main(String[] args) {

        Circle firstCircle = new Circle(1.0, 1.0, 1.0);
        firstCircle.setX(3.0);
        firstCircle.setY(5.0);
        firstCircle.setR(10.0);

        Circle secondCircle = new Circle(1.0, 1.0, 1.0);
        secondCircle.setX(-3.0);
        secondCircle.setY(-5.0);
        secondCircle.setR(10.0);

        System.out.println("S: " + firstCircle.circleArea());
        System.out.println("L: " + secondCircle.circumferenceLength());

        firstCircle.circleCheck(secondCircle);
    }
}
