package prac4_1.task7;

public class Pupil extends Learner {
    private String school;
    private int grade;


    Pupil(String firstName, String lastName, String school, int grade) {
        super(firstName, lastName);
        this.school = school;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", school='" + school + '\'' +
                ", grade=" + grade +
                '}';
    }
}