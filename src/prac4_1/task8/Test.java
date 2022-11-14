package prac4_1.task8;

public class Test {
    public static void main(String[] args) {
        Square square = new Square(4,"Red",false);
        Square square1 = new Square();
        Square square2 = new Square(3);

        System.out.println(square.getSide());
        System.out.println(square.getWidth());
        System.out.println(square.getLength());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println(square);
    }
}
