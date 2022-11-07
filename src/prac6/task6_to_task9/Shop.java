package prac6.task6_to_task9;

public class Shop implements Printable{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shop (String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing shop's sign - " + getName());
    }
}
