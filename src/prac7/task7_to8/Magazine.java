package prac7.task7_to8;

public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable elem : printable) {
            if (elem instanceof Magazine)
                elem.print();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing magazine - " + getName());
    }
}