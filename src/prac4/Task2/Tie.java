package prac4.Task2;

class Tie extends Clothes implements MenClothing{
    public Tie(ClothesSize size, int price, String colour, String name) {
        super(size, price, colour, name);
    }

    @Override
    public void dressMan() {
        System.out.println("A man has tied a tie.");
    }
}
