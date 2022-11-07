package wrapper;

public class task1 {
    public static void main(String[] args) {
        Double num = Double.valueOf(228.1337);
        Double num2 = Double.parseDouble("123.456");

        byte test1 = num.byteValue();
        short test2 = num.shortValue();
        int test3 = num.intValue();
        long test4 = num.longValue();
        float test5 = num.floatValue();
        System.out.printf("%d%n %d%n %d%n %d%n %f%n", test1,test2,test3,test4,test5);

        System.out.println(num);
        System.out.println(num2);

        String line = num.toString();
        System.out.println(line);
    }
}
