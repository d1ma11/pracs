package prac4_1.task9;

public abstract class Furniture {
    private String manufacturer;
    private String material;
    private int price;

    public Furniture(String manufacturer,String material, int price) {
        this.manufacturer = manufacturer;
        this.material = material;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }


}
