package prac4_1.task10;

public class Test {
    public static void main(String[] args) {
        Automobile automobile = new Automobile(5, 0.5, 1500);
        Plane plane = new Plane(15000,5000,5000);
        Train train = new Train(12500, 45, 3000);
        Ship ship = new Ship(11000, 20, 7000);

        System.out.println(automobile.getPrice());
        System.out.println(plane.getPrice());
        System.out.println(train.getPrice());
        System.out.println(ship.getPrice());
    }
}
