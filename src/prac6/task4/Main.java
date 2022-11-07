package prac6.task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", 1_500_000);
        System.out.printf("%s's price - %d", car.getName(),car.getPrice());
    }
}
