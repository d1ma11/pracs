package prac7.task7_to8;

public class Book implements Printable {
    String author;
    String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable elem : printable) {
            if (elem instanceof Book)
                elem.print();
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing book - " + getName());
    }
}