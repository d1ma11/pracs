package prac4_1.task7;

public class Tester {
    public static void main(String[] args) {
        Learner[] learners = {
                new Pupil("Kassandra", "Foley", "East Bridge School", 8),
                new Student("Keegan", "Sims", "University of Richmond", 2),
                new Student("Halle", "Mathis", "Brandeis University", 4),
                new Pupil("Caroline", "Barber", "Acadia Middle School", 7)
        };

        for (Learner learner : learners) {
            System.out.println(learner);
        }
    }
}