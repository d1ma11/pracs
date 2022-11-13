package LinkedLists.task1;

import static LinkedLists.task1.SingleLinkedList.recursiveSort;

public class LinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.push(2);
        list.push(0);
        list.push(5);
        list.push(1);
        list.push(3);
        list.push(7);
        list.push(4);

        list.print();

        recursiveSort(list);

        list.print();
    }
}