package prac4.Task2;

public class Atelier implements MenClothing, WomenClothing{
    Clothes[] arr = {
            new TShirt(ClothesSize.S, 1500, "Purple", "TShirt"),
            new Pants(ClothesSize.XXS, 1000, "Blue", "Pants"),
            new Skirt(ClothesSize.M, 2000, "Black", "Skirt"),
            new Tie(ClothesSize.L, 5000, "Pink", "Tie")
    };
    @Override
    public void dressMan() {
        System.out.println("Man clothes info: ");
        for(Clothes s : arr) {
            if (s instanceof MenClothing) {
                System.out.println(s.name + " " +
                        "{Size: " + s.size.getDescription() +
                        ", Price: " + s.price +
                        ", Colour: " + s.colour +
                        "}");
            }
        }
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman clothes info: ");
        for(Clothes s : arr) {
            if (s instanceof WomenClothing) {
                System.out.println(s.name + " " +
                        "{Size: " + s.size.getDescription() +
                        ", Price: " + s.price +
                        ", Colour: " + s.colour +
                        "}");
            }
        }
    }

    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        atelier.dressWoman();
        atelier.dressMan();
    }
}
