package prac9;

import java.util.Arrays;

class SortingStudentsByGPA extends Student implements Comparable<Student> {

    SortingStudentsByGPA(String name, int id, int examScores) {
        super(name, id, examScores);
    }

    public static void quickSort(Comparable[] sortArr, int low, int high) {
        if (sortArr.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        Comparable border = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[j].compareTo(border) < 0) j--;
            while (sortArr[i].compareTo(border) > 0) i++;
            if (i <= j) {
                Comparable swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    @Override
    public int compareTo(Student s) {
        return this.getExamScores() < s.getExamScores() ? -1 :
                this.getExamScores() == s.getExamScores() ? 0 : 1;
    }

    public static void main(String[] args) {
        Student[] examScores = {
                new SortingStudentsByGPA("Vasya", 12, 123),
                new SortingStudentsByGPA("Dima", 24,258),
                new SortingStudentsByGPA("Denis", 3,248),
                new SortingStudentsByGPA("Ivan", 57,233),
                new SortingStudentsByGPA("Yan", 9,288)
        };

        System.out.println(Arrays.toString(examScores));
        quickSort(examScores,0, examScores.length-1);
        System.out.println(Arrays.toString(examScores));
    }
}
