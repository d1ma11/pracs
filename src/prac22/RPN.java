package prac22;
import java.util.*;

public class RPN {
    public static void compute(String expr) throws
            ArithmeticException,
            EmptyStackException {
        Stack<Double> stack = new Stack<>();

        System.out.println("Input expression: " + expr);
        System.out.printf("%s\t %5s\t %15s\t\n", "Input", "Operation", "Stack after");

        for (String token : expr.split("\\s+")) {
            System.out.printf("%3s", token);
            switch (token) {
                case "+" -> {
                    System.out.printf("%13s", "Operate");
                    stack.push(stack.pop() + stack.pop());
                }
                case "-" -> {
                    System.out.printf("%13s", "Operate");
                    stack.push(-stack.pop() + stack.pop());
                }
                case "*" -> {
                    System.out.printf("%13s", "Operate");
                    stack.push(stack.pop() * stack.pop());
                }
                case "/" -> {
                    System.out.printf("%13s", "Operate");
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                }
                case "^" -> {
                    System.out.printf("%13s", "Operate");
                    double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                }
                default -> {
                    System.out.printf("%13s", "Operate");
                    stack.push(Double.parseDouble(token));
                }
            }

            System.out.printf("         " + stack + "\n");
        }

        System.out.println("Final Answer: " + stack.pop());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll(".(?=.)", "$0 ");
        compute(input);
    }
}