package prac12;

public class Shirt {

    private String article, model, colour, size;

    public Shirt(String item) {
        String[] stringArr = item.split(",");
        article = stringArr[0];
        model = stringArr[1];
        colour = stringArr[2];
        size = stringArr[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "article='" + article + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] array = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        for (String TShirt: array) {
            Shirt shirt = new Shirt(TShirt);
            System.out.println(shirt);
        }
    }
}
