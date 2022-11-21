package LinkedLists.task1;

public class SingleLinkedListIterator<T> implements Iterator<T> {
    Node<T> current;
    public SingleLinkedListIterator(SingleLinkedList<T> list) {
        current = list.getHead();
    }
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.data;
        current = current.next;
        return data;
    }
}
