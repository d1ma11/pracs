package prac4_1.task10;

public class Ship extends Vehicle {
    int avgSpeed = 45;

    Ship(double cargoCapacity, double passengerCapacity, double priceForOneTon) {
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
