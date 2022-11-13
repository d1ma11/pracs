package LinkedLists.task1;

public class SingleLinkedList<T> {
    private Node<T> head;
    /**
     * голова списка
     */

    private int length = 0;

    /**
     * длина списка
     */

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

    public void replace(int position, T newData) {
        if (position > length) {
            System.out.println("Index out of range");
            return;
        }
        Node<T> current = head;
        while (position - 1 >= 0) {
            current = current.next;
            position--;
        }

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
     * @param list Односвязный список
     * @param <T> Описывает тип моего параметра
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
     * @param <T> Описывает тип моего параметра, который является подтипом Number и Comparable
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
