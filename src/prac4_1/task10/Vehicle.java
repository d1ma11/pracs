package prac4_1.task10;

public abstract class Vehicle {
    private final double cargoCapacity;
    private final double passengerCapacity;
    private final double priceForOneTon;
    private final double distance = 10000;

    Vehicle(double cargoCapacity, double passengerCapacity,
            double priceForOneTon) {
        this.cargoCapacity = cargoCapacity;
        this.passengerCapacity = passengerCapacity;
        this.priceForOneTon = priceForOneTon;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getPriceForOneTon() {
        return priceForOneTon;
    }

    public double getDistance() {
        return distance;
    }

    public abstract double getTime();
    public double getPrice() {
        return 0;
    };
}
