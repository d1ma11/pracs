package prac20.task4;

import java.util.List;

public class MinMax<T extends Comparable<T>> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T getMinElement() {
        if (arr.length > 0) {
            T min = arr[0];
            for (T t : arr) {
                if (t.compareTo(min) < 0) {
                    min = t;
                }
            }
            return min;
        }
        return null;
    }

    public T getMaxElement() {
        if (arr.length > 0) {
            T max = arr[0];
            for (T t : arr) {
                if (t.compareTo(max) > 0) {
                    max = t;
                }
            }
            return max;
        }
        return null;
    }
}

class Calculator {
    public static double sum(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static double multiply(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static double divide(Number num1, Number num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public static double subtraction(Number num1, Number num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(3.5f, 6L));
        System.out.println(multiply(1, 0.5));
        System.out.println(divide(15.0, 3f));
        System.out.println(subtraction(228.1337, 666));
    }
}