package prac6.task2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(-1, 1, 2, -1, 5, 10);
        System.out.println(rectangle + "\nMove up");
        rectangle.moveUp();
        System.out.println(rectangle + "\nMove left");
        rectangle.moveLeft();
        System.out.println(rectangle + "\nMove down");
        rectangle.moveDown();
        System.out.println(rectangle+ "\nMove right");
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
