package LinkedLists.task2;

public class DoublyLinkedList<T> {
    private Node<T> head; /** голова списка */
    private Node<T> tail; /** хвост списка */

    private int length = 0; /** длина списка */

    public DoublyLinkedList() {
        head = null;
        tail = null;
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
     * Получение узла списка по индексу
     *
     * @param position позиция того узла, которого надо получить
     * @return возвращает узел списка
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public Node<T> getNode(int position) throws ArrayIndexOutOfBoundsException {
        if (position > length - 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }
        int steps;
        if (position >= length / 2) {
            steps = (length - 1) - position;
            Node<T> current = tail;

            while (steps - 1 >= 0) {
                current = current.prev;
                steps--;
            }
            return current;
        }

        Node<T> current = head;
        steps = position;

        while (steps - 1 >= 0) {
            current = current.next;
            steps--;
        }
        return current;
    }

    /**
     * Получение элемента списка по индексу
     *
     * @param position позиция того элемента, которого надо получить
     * @return возвращает элемент списка на позиции position
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public T getElem(int position) throws ArrayIndexOutOfBoundsException{
        return getNode(position).data;
    }

    /**
     * Добавление нового элемента в начало списка
     *
     * @param data данные передаваемые новому элементу
     */
    public void push(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        length++;

        if (this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;

        head = newNode;
    }

    /**
     * Удаление элемента из начала списка
     * @throws NullPointerException если список пуст, удалять нечего
     */
    public void remove() throws NullPointerException {
        if (this.isEmpty())
            throw new NullPointerException("List is empty!");
        head = head.next;
        head.prev = null;
        length--;
    }

    /**
     * Добавление нового элемента с конца списка
     *
     * @param data данные, передаваемые новому элементу
     */
    public void add(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        length++;

        if (this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /**
     * Удаление элемента с конца списка
     * @throws NullPointerException если список пуст, удалять нечего
     */
    public void pop() throws NullPointerException {
        if (this.isEmpty()) {
            throw new NullPointerException("List is empty!");
        }
        tail = tail.prev;
        tail.next = null;
        length--;
    }

    /**
     * Добавление нового элемента на позицию position
     * Реализация:
     * - если номер позиции, в которую мы хотим добавить элемент, находится
     * ближе к концу списка, тогда проходим с конца списка до нужной позиции;
     * - если номер позиции, в которую мы хотим добавить элемент, находится
     * ближе к началу списка, тогда проходим с начала списка до нужной позиции.
     *
     * @param position позиция в списке, куда мы хотим добавить новый элемент
     * @param data     новый элемент, который мы хотим добавить в список
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public void add(int position, T data) throws ArrayIndexOutOfBoundsException {
        if (position > length + 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }

        if (position == 0) {
            this.push(data);
            return;
        }

        if (position == length) {
            this.add(data);
            return;
        }

        Node<T> newNode = new Node<>();
        newNode.data = data;

        Node<T> current = getNode(position - 1);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current.next.next.prev = newNode;

        length++;
    }

    /**
     * Удаление элемента по индексу position
     *
     * @param position индекс элемента списка, который мы удаляем
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public void remove(int position) throws ArrayIndexOutOfBoundsException {
        if (position > length - 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }
        Node<T> current = getNode(position);
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.prev = null;
        current.next = null;
        length--;
    }

    /**
     * Печать всех элементов списка
     */
    public void print() {
        Node<T> current = head;

        if (this.isEmpty()) {
            System.out.println("null");
            return;
        }

        System.out.print("null <- ");
        while (current.next != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.print(current.data + " -> ");
        System.out.println("null");
    }
}