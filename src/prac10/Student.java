package prac10;

public class Student implements Comparable<Student>{
    private String name, surname;
    private String specialization, group;
    private int course, scores;

    Student(String name, String surname,
            String specialization, String group, int course, int scores) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.group = group;
        this.course = course;
        this.scores = scores;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", scores=" + scores +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.getScores(), s.getScores());
    }

}

