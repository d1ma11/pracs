package prac4.Task2;

class Pants extends Clothes implements MenClothing, WomenClothing{

    public Pants(ClothesSize size, int price, String colour, String name) {
        super(size, price, colour, name);
    }

    @Override
    public void dressMan() {
        System.out.println("A man has dressed pants.");
    }

    @Override
    public void dressWoman() {
        System.out.println("A woman has dressed pants.");
    }
}
