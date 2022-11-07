package prac1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int elem : arr) {
            elem = sc.nextInt();

            if(elem > max) {
                max = elem;
            } else if(elem < min) {
                min = elem;
            }
        }

        System.out.println("Min: " + min + ", max: " + max);
    }
}
