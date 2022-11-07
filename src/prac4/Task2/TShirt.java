package prac4.Task2;

class TShirt extends Clothes implements MenClothing, WomenClothing {

    protected TShirt(ClothesSize size, int price, String colour, String name) {
        super(size, price, colour, name);
    }

    @Override
    public void dressMan() {
        System.out.println("A man has dressed a T-shirt.");
    }
    @Override
    public void dressWoman() {
        System.out.println("A woman has dressed a T-shirt.");
    }
}
