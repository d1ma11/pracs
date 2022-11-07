package prac9;

import java.util.Arrays;

class MergeLists extends Student implements Comparable<Student>{

    MergeLists(String name, int id, int examScores) {
        super(name, id, examScores);
    }

    public static Comparable[] mergeLists(Comparable[] list1, Comparable[] list2) {
        Comparable[] list = new Comparable[list1.length + list2.length];
        System.arraycopy(list1,0,list,0,list1.length);
        System.arraycopy(list2,0,list,list1.length,list2.length);

        for(int i = 0; i < list.length;i++) {
            int pos = i;
            Comparable min = list[i];
            for(int j = i+1;j<list.length;j++) {
                if(list[j].compareTo(min) < 0) {
                    pos = j;
                    min = list[j];
                }
            }
            list[pos] = list[i];
            list[i] = min;
        }

        return list;
    }

    @Override
    public int compareTo(Student s) {
        return this.getName().compareToIgnoreCase(s.getName());
    }

    public static void main(String[] args) {
        Comparable[] studentNames = {
                new MergeLists("Vasya", 12, 123),
                new MergeLists("Dima", 24,258),
                new MergeLists("Denis", 3,248),
                new MergeLists("Ivan", 57,233),
                new MergeLists("Yan", 9,288)
        };

        Comparable[] studentNames1 = {
                new MergeLists("Petr", 34, 252),
                new MergeLists("Pasha", 11, 419)
        };


        System.out.println(Arrays.toString(mergeLists(studentNames, studentNames1)));
    }
}
