package prac2.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, email;
        char gender;
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Gender: ");
        gender = scanner.nextLine().charAt(0);
        Author currentAuthor = new Author(name, email, gender);

        System.out.println("Author's email: " + currentAuthor.getEmail());
        System.out.println("Author's name: " + currentAuthor.getName());
        System.out.println("Author's gender: " + currentAuthor.getGender());
        currentAuthor.setEmail("pushkin06061799@gmail.com");

        System.out.println("Author's email: " + currentAuthor.getEmail());
        System.out.println(currentAuthor);
    }
}
