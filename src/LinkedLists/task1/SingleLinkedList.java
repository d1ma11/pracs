package LinkedLists.task1;

public class SingleLinkedList<T> {
    private Node<T> head; /** голова списка */

    private int length = 0; /** длина списка */

    public SingleLinkedList() {
        head = null;
    }

    /**
     * Получение длины списка
     *
     * @return возвращает длину списка
     */
    public int getLength() {
        return length;
    }

    /**
     * Проверка списка на пустоту
     *
     * @return возвращает true, если список пуст. Иначе - false
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Получение элемента списка по индексу
     *
     * @param position позиция того элемента, которого надо получить
     * @return возвращает элемент списка на позиции position
     */
    public T get(int position) {
        if (position > length) {
            System.out.println("Index out of range");
            return null;
        }
        Node<T> current = head;
        while (position - 1 >= 0) {
            current = current.next;
            position--;
        }
        return current.data;
    }

    /**
     * Добавление нового элемента в начало списка
     *
     * @param data данные передаваемые новому элементу
     */
    public void push(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        length++;
    }

    /**
     * Удаление элемента из начала списка
     */
    public void remove() {
        head = head.next;
        length--;
    }

    /**
     * Добавление нового элемента в конец списка
     *
     * @param data данные, передаваемые новому элементу
     */
    public void add(T data) {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node<T> newNode = new Node<>();
        newNode.data = data;
        current.next = newNode;
        length++;
    }

    /**
     * Удаление элемента с конца списка
     */
    public void pop() {
        Node<T> current = head;
        Node<T> temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
        length--;
    }

    /**
     * Добавление нового элемента на позицию position
     *
     * @param position позиция в списке, куда мы хотим добавить новый элемент
     * @param data     новый элемент, который мы хотим добавить в список
     */
    public void add(int position, T data) {
        if (position > length + 1) {
            System.out.println("Index out of range");
            return;
        }
        if (position == 0) {
            this.push(data);
            return;
        }
        Node<T> current = head;
        Node<T> prev = new Node<>();
        while (position - 1 >= 0) {
            prev = current;
            current = current.next;
            position--;
        }
        prev.next = new Node<>();
        prev.next.data = data;
        prev.next.next = current;
        length++;
    }

    /**
     * Удаление элемента по индексу position
     *
     * @param position индекс элемента списка, который мы удаляем
     */
    public void remove(int position) {
        Node<T> current = head;
        while (position - 1 > 0) {
            current = current.next;
            position--;
        }
        current.next = current.next.next;
        length--;
    }

    /**
     * Очистка списка
     * Как итог - пустой список
     */
    public static void clear(SingleLinkedList list) {
        while (list.head != null) {
            Node next = list.head.next;
            list.head.data = null;
            list.head.next = null;
            list.head = next;
        }
        list.length = 0;
    }

    /**
     * Печать всех элементов списка
     */
    public void print() {
        Node<T> current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println("NULL");
    }
}
