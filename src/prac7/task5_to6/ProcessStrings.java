package prac7.task5_to6;

import java.util.Scanner;

public class ProcessStrings implements StringManipulation {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        System.out.println("Original line: " + s);
        System.out.println("Characters count: " + StringManipulation.countChars(s));
        System.out.println("Characters with odd index: " + StringManipulation.oddPositions(s));
        System.out.println("Reversed line: " + StringManipulation.reverseString(s));
    }
}
