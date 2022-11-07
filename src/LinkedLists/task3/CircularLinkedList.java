package LinkedLists.task3;

public class CircularLinkedList<T> {
    public Node<T> head; /** голова списка */
    public Node<T> tail; /** хвост списка */

    private int length = 0; /** длина списка */

    public CircularLinkedList() {
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
        Node<T> current = head;

        while (position - 1 >= 0) {
            current = current.next;
            position--;
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
    public T getElem(int position) throws ArrayIndexOutOfBoundsException {
        return getNode(position).data;
    }

    /**
     * Добавление нового элемента в начало списка
     *
     * @param data данные передаваемые новому элементу
     */
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        length++;

        if(this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    /**
     * Удаление элемента из начала списка
     * @throws NullPointerException если список пуст, удалять нечего
     */
    public void remove() throws NullPointerException {
        if(this.isEmpty()) {
            throw new NullPointerException("List is empty!");
        }
        head = head.next;
        tail.next = head;
        length--;
    }

    /**
     * Добавление нового элемента с конца списка
     *
     * @param data данные, передаваемые новому элементу
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        length++;

        if(this.isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    /**
     * Удаление элемента с конца списка
     * @throws NullPointerException если список пуст, удалять нечего
     */
    public void pop() throws NullPointerException {
        if(this.isEmpty()) {
            throw new NullPointerException("List is empty!");
        }

        tail = getNode(length-2);
        tail.next = head;
        length--;
    }

    /**
     * Добавление нового элемента на позицию position
     *
     * @param position позиция в списке, куда мы хотим добавить новый элемент
     * @param data     новый элемент, который мы хотим добавить в список
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public void add(int position, T data) throws ArrayIndexOutOfBoundsException {
        if (position > length + 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Index input exceeds array bounds!");
        }

        if(position ==0) {
            this.push(data);
            return;
        }
        if(position==length) {
            this.add(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        Node<T> current = getNode(position - 1);
        newNode.next = current.next;
        current.next = newNode;
        length++;
    }

    /**
     * Удаление элемента по индексу position
     *
     * @param position индекс элемента списка, который мы удаляем
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public void remove(int position) throws ArrayIndexOutOfBoundsException {
        if (position > length -1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }

        if(position ==0) {
            this.remove();
            return;
        }
        if(position==length-1) {
            this.pop();
            return;
        }

        Node<T> prevNode = getNode(position-1);
        prevNode.next = getNode(position+1);

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

        System.out.print("-");
        for(int i = length; i > 0; i--) {
            current.displayNodeData();
            current = current.next;
            System.out.print(" ");
        }
        System.out.println(" --");
    }
}
