package prac4_1.task10;

public class Train extends Vehicle {
    int avgSpeed = 140;

    Train(double cargoCapacity, double passengerCapacity, double priceForOneTon) {
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
