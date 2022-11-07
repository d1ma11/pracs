package prac2;

import java.util.Scanner;

public class ReverseArrElems {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of words: ");
        int value = scanner.nextInt();
        String[] initialArr = new String[value];
        System.out.print("Line: ");

        for (int i = 0; i < value; i++) {
            initialArr[i] = scanner.next();
        }

        //test output
        System.out.print("Initial line: ");
        printArr(initialArr, value);

        //switching elements
        String buff;
        for (int i = 0; i < value / 2; i++) {
            buff = initialArr[value - i - 1];
            initialArr[value - i - 1] = initialArr[i];
            initialArr[i] = buff;
        }
        System.out.print("Reversed line: ");
        printArr(initialArr, value);

    }

    public static void printArr(String[] finalArr, int sizeArr) {
        for (int i = 0; i < sizeArr; i++) {
            System.out.print(finalArr[i] + " ");
        }
    }
}
