package LinkedLists.task1;

public class Car {
    private final String name;
    private final int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
