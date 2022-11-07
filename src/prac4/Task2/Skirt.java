package prac4.Task2;

class Skirt extends Clothes implements WomenClothing{

    public Skirt(ClothesSize size, int price, String colour, String name) {
        super(size, price, colour, name);
    }

    @Override
    public void dressWoman() {
        System.out.println("A woman has dressed a skirt");
    }
}
