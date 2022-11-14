package prac4_1.task9;

public class Armchair extends Furniture{

    public Armchair(String manufacturer, String material, int price) {
        super(manufacturer, material, price);
    }

    @Override
    public String toString() {
        return "Armchair{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
