package tasksAboutRandom;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10, 100);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                flag = true;
            } else {
                System.out.println("\nМассив не является строго возрастающей последовательностью!");
                break;
            }
        }

        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        }
    }
}
