package prac4.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class EShop {
    Scanner sc = new Scanner(System.in);
    private final String login = "a.s.pushkin@yandex.ru";
    private final String password = "pushkin06061799";
    ArrayList<Catalogue> cart = new ArrayList<>();

    public void authorization() {

        while(true) {
            System.out.print("Enter login: ");
            String input_login = sc.nextLine();
            System.out.print("Enter password: ");
            String input_password = sc.nextLine();
            if (!input_login.equals(login) || !input_password.equals(password)) {
                System.out.println("You have entered wrong login or password! Try again");
            } else {
                System.out.println("You have been authorized!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        EShop user = new EShop();
        user.authorization();
        user.watchCatalogue();
        user.watchCategory();
        user.toCart();
        user.buyItemsInCart();
    }

    public void watchCatalogue() {
        for(int i = 0; i < Category.values().length; i++) {
            System.out.printf("%d. %s\n", i+1, Category.values()[i]);
        }
    }

    public void watchCategory() {
        System.out.print("Choose a category: ");
        int choice = sc.nextInt();
        Category choice2 = null;
        switch (choice) {
            case 1 -> choice2 = Category.ELECTRONICS;
            case 2 -> choice2 = Category.MEAT;
            case 3 -> choice2 = Category.BOOKS;
        }
        for(Catalogue elem : Catalogue.values()) {
            if (elem.getCategory() == choice2) {
                System.out.println(elem);
            }
        }
    }

    public void toCart() {
        System.out.println("Choose an product to put it into cart(to stop " +
                "choosing a products type '0'): ");
        while(true) {
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            cart.add(Catalogue.values()[choice - 1]);
        }
    }

    public void buyItemsInCart() {
        int sum = 0;
        for(Catalogue s : cart) {
            sum += s.getPrice();
        }
        System.out.println("Pay " + sum + " for your products.");
    }
}