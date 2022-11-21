package LinkedLists.task1;



public class SingleLinkedList<T> {
    /**
     * голова списка
     */
    private Node<T> head;

    /**
     * Геттер для головы списка
     * @return голова списка
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * длина списка
     */
    private int length = 0;

    /**
     * Конструктор итератора
     * @return итератор для данного списка
     */
    public Iterator<T> iterator() {
        return new SingleLinkedListIterator<>(this);
    }

    public SingleLinkedList() {
        head = null;
    }

    /**
     * Получение длины списка
     *
     * @return длину списка
     */
    public int getLength() {
        return length;
    }

    /**
     * Проверка списка на пустоту
     *
     * @return true, если список пуст. Иначе - false
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Получение узла списка по индексу
     *
     * @param position позиция того узла, которого надо получить
     * @return узел списка
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public Node<T> getNode(int position) throws ArrayIndexOutOfBoundsException{
        if (position > length | position < 0) {
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
     * @return элемент списка на позиции position
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public T get(int position) throws ArrayIndexOutOfBoundsException {
        return getNode(position).data;
    }

    /**
     * Замена данных в узле в данной позиции
     * @param position позиция узла, где производится замена данных
     * @param newData новые вводимые данные
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public void replace(int position, T newData) throws ArrayIndexOutOfBoundsException{
        Node<T> current = getNode(position);
        current.data = newData;
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
     * @throws NullPointerException если список пуст, удалять нечего
     */
    public void remove() throws NullPointerException{
        if (this.isEmpty())
            throw new NullPointerException("List is empty!");
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
     * @throws NullPointerException если список пуст, удалять нечего
     */
    public void pop() throws NullPointerException{
        if(this.isEmpty())
            throw new NullPointerException("List is empty!");
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
     * @throws ArrayIndexOutOfBoundsException вводимый индекс превышает границы списка
     */
    public void add(int position, T data) throws ArrayIndexOutOfBoundsException{
        if (position > length + 1 | position < 0) {
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
        }
        if (position == 0) {
            this.push(data);
            return;
        }
        Node<T> current = head;
        while (position - 1 > 0) {
            current = current.next;
            position--;
        }
        Node<T> newNode = new Node<>();
        newNode.data = data;
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
    public void remove(int position) throws ArrayIndexOutOfBoundsException{
        if(position>length-1|position<0)
            throw new ArrayIndexOutOfBoundsException("Input index exceeds array bounds!");
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
     *
     * @param list Односвязный список
     * @param <T>  Описывает тип моего параметра
     */
    public static <T> void clear(SingleLinkedList<T> list) {
        while (list.head != null) {
            Node<T> next = list.head.next;
            list.head.data = null;
            list.head.next = null;
            list.head = next;
        }
        list.length = 0;
    }

    /**
     * Сортирует список рекурсивным методом
     *
     * @param list Односвязный список
     * @param <T>  Описывает тип моего параметра, который является подтипом Number и Comparable
     */
    public static <T extends Number & Comparable<T>> void recursiveSort(SingleLinkedList<T> list) {
        if (list.length <= 1) return;

        SingleLinkedList<T> a = new SingleLinkedList<>();
        int a_length = list.length / 2;

        SingleLinkedList<T> b = new SingleLinkedList<>();
        int b_length = list.length - a_length;

        for (int i = 0; i < list.length; i++) {
            if (i < a_length)
                a.add(i, list.get(i));
            else
                b.add(i - a_length, list.get(i));
        }

        recursiveSort(a);
        recursiveSort(b);

        int ai = 0, bi = 0;
        while (ai + bi < list.length) {
            // если индекс bi >= длины списка b
            // или (индекс ai < длины списка a и элемент списка a в индексе ai < элемента списка b в индексе bi*/
            if (bi >= b_length || (ai < a_length && (a.get(ai).compareTo(b.get(bi))) < 0)) {
                list.replace(ai + bi, a.get(ai));
                ai++;
            } else {
                list.replace(ai + bi, b.get(bi));
                bi++;
            }
        }
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
