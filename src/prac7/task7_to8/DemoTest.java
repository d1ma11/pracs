package prac7.task7_to8;

import static prac7.task7_to8.Book.printBooks;
import static prac7.task7_to8.Magazine.printMagazines;

public class DemoTest {
    public static void main(String[] args) {
        Printable[] printables = {
                new Magazine("Magazine #1"),
                new Magazine("Magazine #2"),
                new Book("Ivanov Petya", "Book #35"),
                new Magazine("Magazine #6")};

        printMagazines(printables);
        System.out.println();
        printBooks(printables);
    }
}
