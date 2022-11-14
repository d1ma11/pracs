package prac4_1.task10;

public class Plane extends Vehicle {
    int avgSpeed = 700;
    Plane(double cargoCapacity, double passengerCapacity, double priceForOneTon) {
        super(cargoCapacity, passengerCapacity, priceForOneTon);
    }

    @Override
    public double getTime() {
        return getDistance() / avgSpeed;
    }

    @Override
    public double getPrice() {
        return (getCargoCapacity() + getPassengerCapacity()) * getPriceForOneTon();
    }
}
