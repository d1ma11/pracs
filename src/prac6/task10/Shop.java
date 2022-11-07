package prac6.task10;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static final List<Computer> shopAssortment = new ArrayList<>();

    public static void addPC(Computer computer) {
        if(!shopAssortment.contains(computer)) {
            shopAssortment.add(computer);
        } else {
            System.out.println("This computer already exists");
        }
    }

    public static void deletePC(Computer computer) {
        shopAssortment.remove(computer);
    }

//    public static Computer search() {
//        return new Computer();
//    }

    public static void main(String[] args) {
    }
}
