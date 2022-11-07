package tasksAboutRandom;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static int  getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Введите натуральное число n: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int n = getInt();

        int[] arr = new int[n];
        ArrayList<Integer> evenArr = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(0,n+1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                evenArr.add(arr[i]);
            }
        }
        System.out.println("\n" + evenArr);
    }
}
