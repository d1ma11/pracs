package prac4_1.task9;

public class Sofa extends Furniture{

    public Sofa(String manufacturer, String material, int price) {
        super(manufacturer, material, price);
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
