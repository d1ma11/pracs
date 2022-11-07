package prac1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int avg, sum = 0;

        for(int elem : arr) {
            elem = sc.nextInt();
            sum += elem;
        }
        avg = sum / arr.length;
        System.out.println("Avg: " + avg + ", sum: " + sum);
    }
}
