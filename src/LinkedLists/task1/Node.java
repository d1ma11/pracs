package LinkedLists.task1;

public class Node<T> {
    public T data; /** данные узла списка */
    public Node<T> next; /** ссылка на следующий узел */

    public Node() {
        next = null;
        data = null;
    }

    /**
     * Вывод данных узла и ссылку на следующий узел
     */
    public void displayNodeData() {
        System.out.print(data + " -> ");
    }
}