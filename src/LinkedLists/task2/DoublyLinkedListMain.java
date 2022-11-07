package LinkedLists.task2;

public class DoublyLinkedListMain {
    public static void main(String[] args) {

        DoublyLinkedList<Student> list = new DoublyLinkedList<>();

        System.out.println("Is list empty: " + list.isEmpty());

        list.print();

        list.add(new Student("Zeroth", 14));
        list.print();

        list.push(new Student("Sixth",24));
        list.print();
        list.push(new Student("Fifth",14));
//        list.print();
        list.push(new Student("Fourth",234));
//        list.print();
        list.push(new Student("Third", 43));
//        list.print();
        list.push(new Student("Second", 23));
//        list.print();
        list.push(new Student("First",18));
        list.print();

        list.remove();
        list.print();

        System.out.println("Loh " + list.getLength() + "  " + list.getElem(6));

        list.add(1,new Student("Seventh",95));
        list.print();

        System.out.println(list.getNode(2).data);

        list.add(4, new Student("NewNode", 228));
        list.print();

        list.pop();
        list.print();
    }
}
