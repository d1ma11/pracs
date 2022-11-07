package prac18.task4;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        String intString = sc.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error");
        } finally {
            System.out.println("This block of code always works");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}

