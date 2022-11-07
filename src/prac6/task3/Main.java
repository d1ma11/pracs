package prac6.task3;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Jupyter");
        Car car = new Car("Toyota");
        Animal animal = new Animal("Eagle");

        System.out.println("Planet's name - " + planet.getName());
        System.out.println("Car's name - " + car.getName());
        System.out.println("Animal's name - " + animal.getName());
    }
}
