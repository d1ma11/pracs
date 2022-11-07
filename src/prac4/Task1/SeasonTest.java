package prac4.Task1;

public class SeasonTest {
    public void info(Seasons season) {
        switch (season) {
            case WINTER -> System.out.println("People celebrate HappyNewYear");
            case SPRING -> System.out.println("Nature is beginning to wake up");
            case SUMMER -> System.out.println("It's very warm outside and all people walk a lot");
            case AUTUMN -> System.out.println("A lot of yellow leaves start to appear on the trees");
        }
    }

    public static void main(String[] args) {
        Seasons favourite = Seasons.SUMMER;
        for (Seasons s : Seasons.values()) {
            System.out.println(s + " " + s.getAvg() + " " + s.getDescription()  );
        }
    }
}

