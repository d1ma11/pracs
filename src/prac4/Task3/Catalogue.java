package prac4.Task3;

public enum Catalogue {
    HEADPHONES(Category.ELECTRONICS, 1300),
    MP3PLAYER(Category.ELECTRONICS, 1000),
    KEYBOARD(Category.ELECTRONICS, 3000),
    BACON(Category.MEAT, 1400),
    LAMB(Category.MEAT, 1140),
    SAUSAGES(Category.MEAT, 890),
    POEM(Category.BOOKS, 1400),
    FANTASY(Category.BOOKS, 1700),
    COMEDY(Category.BOOKS, 1000),
    ;

    private final Category category;
    private final int price;

    Catalogue(Category category, int price) {
        this.category = category;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getIndex() {
        return this.ordinal()+1;
    }

    @Override
    public String toString() {
        return  this.name() +
                " {Price: " + price +
                ", Index: " + getIndex() +
                "}";
    }
}

enum Category {
    ELECTRONICS,
    MEAT,
    BOOKS,
}