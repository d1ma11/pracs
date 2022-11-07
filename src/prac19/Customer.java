package prac19;

import java.util.Random;
import java.util.Scanner;

class INN_numberException extends Exception {
    INN_numberException(String errMessage) {
        super(errMessage);
    }
}

public class Customer {

    public static boolean isValidINN(String INN_number) {
        Random rand = new Random();
        return rand.nextBoolean();
    }


    public static void purchaseStuff() throws INN_numberException {
        Scanner sc = new Scanner(System.in);

        String name, surname, patronymic;
        String innNumber;

        System.out.println("Input your name, surname and patronymic: ");
        name = sc.nextLine();
        surname = sc.nextLine();
        patronymic = sc.nextLine();

        System.out.print("Input your INN number: ");
        innNumber = sc.nextLine();

        if (isValidINN(innNumber)) {
            throw new INN_numberException("Your INN number is not valid.");
        }
        System.out.println("You've purchased some stuff.");
    }

    public static void main(String[] args) {
        try {
            purchaseStuff();
        } catch (INN_numberException exception) {
            exception.printStackTrace();
        }
    }
}
