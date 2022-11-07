package prac6.task4;

public class Car implements Priceable{
    private final String name;
    private final int price;

    public Car(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
