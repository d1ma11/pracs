package prac2.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x, y;

        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();

        Ball currentBall = new Ball(x, y);
        System.out.println(currentBall);
        currentBall.setX(10);
        currentBall.setY(-10);
        System.out.println(currentBall);
        currentBall.setXY(0, 20);
        System.out.println(currentBall);
        System.out.print("X change: ");
        x = scanner.nextDouble();
        System.out.print("У change: ");

        y = scanner.nextDouble();
        currentBall.move(x, y);
        System.out.println(currentBall);
    }
}
