package prac4_1.task9;

public class Table extends Furniture{

    public Table(String manufacturer, String material, int price) {
        super(manufacturer, material, price);
    }

    @Override
    public String toString() {
        return "Table{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
