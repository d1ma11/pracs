package prac4_1.task9;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    public static List<Furniture> cart = new ArrayList<>();
    private final static Furniture[] shopItems = {
            new Armchair("IKEA", "wood", 10000),
            new Sofa("IKEA", "wool", 15000),
            new Table("IKEA", "wood", 7500)
    };

    public static void buyItem(int idItem) {
        switch (idItem) {
            case 1 -> cart.add(shopItems[0]);
            case 2 -> cart.add(shopItems[1]);
            case 3 -> cart.add(shopItems[2]);
        }
    }

    public static void checkCart() {
        System.out.println("""
                Ваша корзина:""");
        for(Furniture elem : cart) {
            System.out.println(elem);
        };
    }

    public static void main(String[] args) {
        System.out.println("""
                Добро пожаловать в магазин мебели!
                Выберите товар для покупки:
                1. Кресло
                2. Стол
                3. Диван""");
        buyItem(2);
        checkCart();
    }
}
