package LinkedLists.task1;

public class LinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList<Student> linkedList = new SingleLinkedList<>();

        System.out.println("Is list empty: " + linkedList.isEmpty());

        linkedList.push(new Student("Dima",18));
        linkedList.print();
        linkedList.push(new Student("Oleg", 23));
        linkedList.print();
        linkedList.push(new Student("Yaropolk", 43));
        linkedList.print();

        linkedList.add(new Student("Vladimir", 12));
        linkedList.print();

        linkedList.pop();
        linkedList.print();

        linkedList.remove();
        linkedList.print();

        System.out.println();

        linkedList.remove(1);
        linkedList.print();

        System.out.println("The length of the list: " + linkedList.getLength());

        linkedList.add(1, new Student("Kirill", 52));
        linkedList.print();

        linkedList.add(0,new Student("Ivan",13));
        linkedList.print();

        System.out.println("Get 1 position element: " + linkedList.get(1));

        System.out.println("Is list empty: " + linkedList.isEmpty());

        SingleLinkedList.clear(linkedList);
        linkedList.print();

        System.out.println("Is list empty: " + linkedList.isEmpty());

        System.out.println("The length of list: " + linkedList.getLength());

    }
}