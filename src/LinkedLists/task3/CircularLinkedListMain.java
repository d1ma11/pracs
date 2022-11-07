package LinkedLists.task3;

public class CircularLinkedListMain {
    public static void main(String[] args) {

        CircularLinkedList<Student> list = new CircularLinkedList<>();

        System.out.println("Is list empty: " + list.isEmpty());

        list.print();

        list.push(new Student("Sixth",24));
        list.print();
        list.push(new Student("Fifth",14));
        list.print();

        list.push(new Student("Zeroth", 14));
        list.print();

        list.add(0,new Student("1",1));
        list.add(list.getLength(),new Student("End",133));
        list.add(2,new Student("Middle",48));
        list.print();

        list.remove(0);
        list.print();
        list.remove(list.getLength()-1);
        list.print();
        list.remove(2);
        list.print();
    }
}
