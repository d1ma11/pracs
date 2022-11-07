package prac4.Task2;

abstract class Clothes {
    ClothesSize size;
    int price;
    String colour;
    String name;

    public Clothes(ClothesSize size, int price, String colour, String name) {
        this.size = size;
        this.price = price;
        this.colour = colour;
        this.name = name;
    }

    public ClothesSize getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Information {" +
                "Size: " + size.getDescription() +
                ", Price: " + price +
                ", Colour: " + colour +
                "}";
    }
}
