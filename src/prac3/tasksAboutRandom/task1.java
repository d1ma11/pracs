package prac3.tasksAboutRandom;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        double[] arr_rand = new double[15];
        double[] arr_math = new double[15];

        for (int i = 0; i < arr_rand.length; i++) {
            arr_rand[i] = rand.nextDouble(1,10);
            arr_math[i] = Math.random();
        }

        System.out.println(Arrays.toString(arr_rand));
        System.out.println(Arrays.toString(arr_math));

        Arrays.sort(arr_rand);
        Arrays.sort(arr_math);

        System.out.println();

        System.out.println(Arrays.toString(arr_rand));
        System.out.println(Arrays.toString(arr_math));
    }
}
