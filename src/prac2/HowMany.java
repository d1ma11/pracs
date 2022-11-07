package prac2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowMany {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        int counter = 0;
        while (st.hasMoreTokens()) {
            String s1 = st.nextToken();
            counter += 1;
        }

        System.out.println("Words entered: " + counter);
    }
}
