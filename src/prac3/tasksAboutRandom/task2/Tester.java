package prac3.tasksAboutRandom.task2;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {
    int count;
    Circle[] arr;

    public Tester(int count) {
        this.count = count;
        arr = new Circle[count];
    }

    public static Circle findMax(Circle[] arr) {
        int indexMax = 0;
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].R > max) {
                max = arr[i].R;
                indexMax = i;
            }
        }
        return arr[indexMax];
    }

    public static Circle findMin(Circle[] arr) {
        int indexMin = 0;
        double min = 100000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].R < min) {
                min = arr[i].R;
                indexMin = i;
            }
        }
        return arr[indexMin];
    }

    public static void sortCircles(Circle[] arr) {
        Arrays.sort(arr, Comparator.comparing(a -> a.R));
    }

    public static void main(String[] args) {
        Tester test = new Tester(4);
        for(int i = 0; i < test.arr.length; i++) {
            test.arr[i] = new Circle();
        }


        for(int i = 0; i < test.arr.length; i++) {
            System.out.println(test.arr[i]);
        }

        System.out.println("\nMax circle: " + findMax(test.arr));
        System.out.println("Min circle: " + findMin(test.arr));

        sortCircles(test.arr);

        System.out.println();
        for(int i = 0; i < test.arr.length; i++) {
            System.out.println(test.arr[i]);
        }

    }
}
