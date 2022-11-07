package prac1;

public class task7 {
    public static int factorial(int a) {
        int ans = 1;
        for(int i = 1; i <= a; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
