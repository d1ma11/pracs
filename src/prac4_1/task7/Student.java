package prac4_1.task7;

public class Student extends Learner {
    private String university;
    private int course;

    Student(String firstName, String lastName, String university, int course) {
        super(firstName, lastName);
        this.university = university;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", university='" + university + '\'' +
                ", course=" + course +
                '}';
    }
}