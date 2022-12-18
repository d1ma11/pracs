package prac30_31;

import java.io.*;
import java.util.*;

class Node {
    public int iData;           // Данные, используемые в качестве ключа
    public double dData;        // Другие данные
    public Node leftChild;      // Левый потомок узла
    public Node rightChild;     // Правый потомок узла

    public void displayNode() { // Вывод узла
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}

/////////////////////////////////////////////////////////////////////

public class BinaryTree {
    private Node root;          // Корневой узел дерева

    // --------------------------------------------------------------
    public BinaryTree() {       // Конструктор
        root = null;            // Пока нет ни одного узла
    }

    public Node getRoot() {
        return root;
    }

    //-------------------------------------------------------------------

    /**
     * Поиск узла с заданным ключом
     * (предполагается, что дерево не пустое)
     *
     * @param key заданный ключ, по которому производится поиск
     * @return возвращение узла, если он существует, иначе - возвращает null
     */
    public Node find(int key) {
        Node current = root;                        // Начать с корневого узла
        while (current.iData != key) {              // Пока не найдено совпадение
            if (key < current.iData)                // Двигаемся влево?
                current = current.leftChild;
            else                                    // Двигаемся вправо?
                current = current.rightChild;
            if (current == null)                    // Если потомка нет, поиск завершился неудачей
                return null;
        }
        return current;                             // Элемент найден
    }

//-------------------------------------------------------------------

    /**
     * Вставка нового узла в дерево
     * @param id данные, используемые в качестве ключа
     * @param dd другие данные
     */
    public void insert(int id, double dd) {
        Node newNode = new Node();                  // Создание нового узла
        newNode.iData = id;                         // Вставка данных
        newNode.dData = dd;
        if (root == null)                           // Корневой узел не существует
            root = newNode;
        else {                                      // Корневой узел занят
            Node current = root;                    // Начать с корневого узла
            Node parent;
            while (true) {                          // (внутренний выход из цикла)
                parent = current;
                if (id < current.iData) {           // Двигаемся влево?
                    current = current.leftChild;
                    if (current == null) {          // Если достигнут конец цепочки, вставляем узел слева
                        parent.leftChild = newNode;
                        return;
                    }
                } else {                            // Двигаемся вправо?
                    current = current.rightChild;
                    if (current == null) {          //Если достигнут конец цепочки, вставляем узел справа
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

//-------------------------------------------------------------------

    /**
     * Подсчет количества узлов в бинарном дереве двоичного поиска
     * @param node начальный узел, с которого начинается подсчет
     * @return число узлов в дереве
     */
    public int getNodeCount(Node node) {
        if (node == null)
            return 0;
        else
            return (getNodeCount(node.leftChild) + getNodeCount(node.rightChild) + 1);
    }

//-------------------------------------------------------------------

    /**
     * Проверка на совпадение двух разных деревьев
     * @param thisRoot корень первого дерева
     * @param thatRoot корень второго дерева
     * @return true, если совпадают
     *         false, если не совпадают
     */
    public boolean isSameTree(Node thisRoot, Node thatRoot) {
        if (thisRoot == null && thatRoot == null)
            return true;
        else if (thisRoot != null && thatRoot != null) {
            return
                thisRoot.iData == thatRoot.iData &&
                    isSameTree(thisRoot.leftChild, thatRoot.rightChild) &&
                        isSameTree(thisRoot.rightChild, thatRoot.rightChild)
            ;
        } else
            return false;
    }

//-------------------------------------------------------------------

    /**
     * Получение максимальной ширины бинарного дерева
     * @param root корень дерева, с которого мы начинаем
     * @return максимальная ширина
     */
    public int getMaxBinaryWidth(Node root) {
        int maxWidth = 0;
        int width;
        int h = height(root);
        int i;

        for (i = 1; i <= h; i++) {
            width = getBinaryWidth(root, i);
            if (width > maxWidth)
                maxWidth = width;
        }

        return maxWidth;
    }

    private int getBinaryWidth(Node root, int level) {
        if (root == null)
            return 0;
        if (level == 1)
            return 1;
        else if (level > 1)
            return getBinaryWidth(root.leftChild, level - 1) + getBinaryWidth(root.rightChild, level - 1);

        return 0;
    }

//-------------------------------------------------------------------

    /**
     * Получение высоты бинарного дерева
     * @param root корень данного дерева
     * @return число, показывающее высоту бинарного дерева
     */
    public int height(Node root) {
        if (root == null)
            return 0;
        else {
            // подсчет высоты каждого из поддеревьев
            int leftHeight = height(root.leftChild);
            int rightHeight = height(root.rightChild);

            return (leftHeight > rightHeight) ?
                    (leftHeight + 1) :
                    (rightHeight + 1);
        }
    }

//-------------------------------------------------------------------

    /**
     * Зеркальное отражение бинарного дерева
     * @param root корень данного дерева
     */
    public static void reverseTree(final Node root) {
        if (root == null)
            return;

        final Node temp = root.rightChild;
        root.rightChild = root.leftChild;
        root.leftChild = temp;

        reverseTree(root.leftChild);
        reverseTree(root.rightChild);
    }

//-------------------------------------------------------------------

    /**
     * Удаление узла с заданным ключом
     * (предполагается, что дерево не пусто)
     * @param key ключ, по которому происходит удаление
     * @return возвращает true при успешном удалении, иначе - false
     */
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.iData != key) {                      // Поиск узла
            parent = current;
            if (key < current.iData){                       // Двигаемся влево?
                isLeftChild = true;
                current = current.leftChild;
            }
            else {                                          // Двигаемся вправо?
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)                            // Конец цепочки
                return false;                               // Узел не найден
        }
        // Удаляемый узел найден

        // Случай #1. Если узел не имеет потомков, он просто удаляется.
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }

        // Случай #2-1. Если нет правого потока, узел заменяется левым поддеревом
        else if (current.rightChild == null)
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;

        // Случай #2-2. Если нет левого потока, узел заменяется правым поддеревом
        else if (current.leftChild == null)
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;

        // Случай #2-3. Если потомка два -> узел заменяется преемником
        else {
            Node successor = getSuccessor(current); // Поиск преемника для удаляемого узла (current)

            if (current == root)                    // Родитель current связывается с посредником
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;

            successor.leftChild = current.leftChild;// Преемник связывается с левым потомком current
        }
        // (преемник не может иметь левого потомка)
        return true;
    }

//-------------------------------------------------------------------

    /**
     * Метод возвращает узел со следующим значением после delNode
     * Для этого он сначала переходит к правому потомку, а затем
     * отслеживает цепочку левых потомков этого узла
     * @param delNode удаляемый узел
     * @return преемника узла, переданного в аргументе delNode
     */
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;          // Переход к правому потоку

        while (current != null) {                   // Пока остаются левые потомки
            successorParent = successor;
            successor = current;
            current = current.leftChild;            // Переход к левому потоку
        }

        // Если преемник не является правым потомком, создать связь между узлами
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

//-------------------------------------------------------------------

    public void traverse(int traverseType) {
        switch(traverseType) {
            case 1 -> {                             // Прямой обход дерева
                System.out.print("Preorder traversal: ");
                preOrder(root);
            }
            case 2 -> {                             // Симметричный обход дерева
                System.out.print("Inorder traversal: ");
                inOrder(root);
            }
            case 3 -> {                             // Обратный обход дерева
                System.out.print("Postorder traversal: ");
                postOrder(root);
            }
        }
    }

//-------------------------------------------------------------------

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

//-------------------------------------------------------------------

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

//-------------------------------------------------------------------

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }

//-------------------------------------------------------------------

    public void displayTree() {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;

            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');

            while (!globalStack.isEmpty()) {
                Node temp = globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for (int j = 0; j < nBlanks*2-2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop());
        }
        System.out.println("......................................................");
    }
}

////////////////////////////////////////////////////////////////

class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(50, 1.5);
        binaryTree.insert(25, 1.2);
        binaryTree.insert(75, 1.7);
        binaryTree.insert(12, 1.5);
        binaryTree.insert(37, 1.2);
        binaryTree.insert(43, 1.7);
        binaryTree.insert(30, 1.5);
        binaryTree.insert(33, 1.2);
        binaryTree.insert(87, 1.7);
        binaryTree.insert(93, 1.5);
        binaryTree.insert(97, 1.5);

        WhileLoop: while (true) {
            System.out.print
                    ("Enter first letter of " +
                            "show (s), " +
                            "insert (i), " +
                            "find (f), " +
                            "delete (d), " +
                            "traverse (t), " +
                            "get count of tree nodes (c), " +
                            "get height of tree (h), " +
                            "get width of tree (w), " +
                            "reverse (r), " +
                            "exit (e): "
                    );

            int choice = getChar();
            switch (choice) {
                case 's' -> binaryTree.displayTree();

                case 'w' -> System.out.println("Width of the binary tree: " + binaryTree.getMaxBinaryWidth(binaryTree.getRoot()));

                case 'c' -> System.out.println("Count of tree nodes: " + binaryTree.getNodeCount(binaryTree.getRoot()));

                case 'h' -> System.out.println("Height of the binary tree: " + binaryTree.height(binaryTree.getRoot()));

                case 't' -> {
                    System.out.print(
                            """
                            Выберите обход вашего бинарного дерева:
                            1. Прямой
                            2. Симметричный
                            3. Обратный
                            Введите:\s""");
                    int _traverse = getInt();
                    binaryTree.traverse(_traverse);
                    System.out.println();
                }

                case 'i' -> {
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    binaryTree.insert(value, value + 0.9);
                }

                case 'f' -> {
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = binaryTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.println();
                    }
                }

                case 'r' -> {
                    System.out.println("Reversing a binary tree...");

                    BinaryTree.reverseTree(binaryTree.getRoot());
                }

                case 'd' -> {
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    binaryTree.delete(value);
                }
                case 'e' -> {
                    break WhileLoop;
                }
            }
        }
    }

//-------------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}