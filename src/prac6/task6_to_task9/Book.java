package prac6.task6_to_task9;

public class Book implements Printable{
    String author;
    String name;

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

    public Book (String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing book - " + getName());
    }
}