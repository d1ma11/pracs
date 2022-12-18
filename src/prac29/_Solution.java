package prac29;

import java.util.Scanner;

public class _Solution {
    public static void main(String[] args) {
        _Solution solution = new _Solution();

        solution.solve();
    }

    private void solve() {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[][] g = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (g[i][j] == 1)
                    count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
