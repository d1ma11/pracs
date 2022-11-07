package LinkedLists.task2;

public class Node<T> {
    public T data; /** данные узла списка */

    public Node<T> next; /** ссылка на следующий узел */
    public Node<T> prev; /** ссылка на предыдущий узел */

    public Node() {
        next = null;
        prev = null;
        data = null;
    }

    /**
     * Вывод данных узла и ссылок на предыдущий и следующий узел
     */
    public void displayNodeData() {
        System.out.print(data + " <-> ");
    }
}
