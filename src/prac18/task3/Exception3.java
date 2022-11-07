package prac18.task3;

import java.util.Scanner;

public class Exception3 {
    public static void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        String intString = sc.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
