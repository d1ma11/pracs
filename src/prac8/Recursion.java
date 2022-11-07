package prac8;

import java.util.Scanner;

public class Recursion {
    public static String triangleSequence(int n) {
        int sum = 0, j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(triangleSequence(--n) + " " + j);
        }
        return "";
    }

    public static String fromOneToN(int n) {
        if (n == 1) return "1";
        else System.out.print(fromOneToN(n - 1) + " " + n);
        return "";
    }

    public static String fromAtoB(int A, int B) {
        if (A > B) {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + fromAtoB(A - 1, B);
        } else {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + fromAtoB(A + 1, B);
        }
    }

    public static int thatDigitSum(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += thatDigitSum(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int digitsSum(int n) {
        if (n == 0) return 0;
        return n % 10 + digitsSum(n / 10);
    }

    public static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return isPrime(n, i + 1);
        } else {
            return true;
        }
    }

    public static void factorization(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            factorization(n / k, k);
        } else {
            factorization(n, ++k);
        }
    }

    public static String isPalindrome(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return isPalindrome(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int withoutTwoZeroes(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return withoutTwoZeroes(a, b - 1) + withoutTwoZeroes(a - 1, b - 1);
    }

    public static int reverseNumber(int n, int i) {
        return (n==0) ? i : reverseNumber( n/10, i*10 + n%10 );
    }

    public static int unitsNumber() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return unitsNumber() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return unitsNumber() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return unitsNumber() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void oddNumbers() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                oddNumbers();
            } else {
                oddNumbers();
            }
        }
    }

    public static void oddIndexNumber() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                oddIndexNumber();
            }
        }
    }

    public static String leftToRight(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return leftToRight(n / 10) + " " + n % 10;
        }
    }

    public static int rightToLeft(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return rightToLeft(n / 10);
        }
    }

    public static void countElementsEqualMax(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                countElementsEqualMax(n, 1);
            } else if (n == max) {
                countElementsEqualMax(max, ++count);
            } else {
                countElementsEqualMax(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    public static int maxSequenceElement() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, maxSequenceElement());
        }
    }

    public static void main(String[] args) {
        triangleSequence(5);
        System.out.println();

        System.out.println(fromOneToN(7));
        System.out.println(fromAtoB(20, 15));
        System.out.println(fromAtoB(-10, -5));
        System.out.println(thatDigitSum(0, 0, 3, 15));
        System.out.println(digitsSum(228));
        System.out.println(isPrime(18, 2));
        factorization(150, 2);
        System.out.println(isPalindrome("tenet"));
        System.out.println(withoutTwoZeroes(5, 8));
        System.out.println(reverseNumber(158, 0));
        System.out.println(unitsNumber());
        oddNumbers();
        oddIndexNumber();
        System.out.println(leftToRight(153));
        System.out.println(rightToLeft(123));
        countElementsEqualMax(0, 0);
        System.out.println(maxSequenceElement());
    }
}
