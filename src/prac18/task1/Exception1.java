package prac18.task1;

public class Exception1 {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException exception) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
