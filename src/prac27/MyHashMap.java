package prac27;

class Entry<K extends Double, V> {
    private K key;
    private V value;
    private Entry<K, V> next;

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}

public class MyHashMap<K extends Double, V> {

    private int capacity = 16;

    private Entry<K, V>[] array;

    public MyHashMap() {
        array = new Entry[capacity];
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        array = new Entry[capacity];
    }

    public int index(K key) {
        if (key == null)
            return 0;
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        int index = index(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);
        if (array[index] == null) {
            array[index] = newEntry;
        } else {
            Entry<K, V> currentNode = array[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    break;
                } else {
                    currentNode.setNext(newEntry);
                }
                currentNode = currentNode.getNext();
            }
        }
    }

    public V get(K key) {
        V value = null;
        int index = index(key);
        Entry<K, V> entry = array[index];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key) {
        int index = index(key);
        Entry<K, V> previous = null;
        Entry<K, V> entry = array[index];
        while (entry != null) {
            if (entry.getKey().equals(key)) {
                if (previous == null) {
                    entry = entry.getNext();
                    array[index] = entry;
                } else {
                    previous.setNext(entry.getNext());
                }
                return;
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (array[i] != null) {
                Entry<K, V> currentNode = array[i];
                while (currentNode != null) {
                    System.out.printf("Key is %s and value is %s%n",
                            currentNode.getKey(), currentNode.getValue());
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<Double, String> map = new MyHashMap<>();

        System.out.println("Going to add entries in map");
        map.put(null, "Nothing");
        map.put(1.0, "George Washington");
        map.put(2.0, "John Adams");
        map.put(3.0, "Thomas Jefferson");
        map.put(35.0, "John F. Kennedy");
        System.out.println("**********************************************");

        System.out.println("Getting entry with key 1 and 35 from map");
        System.out.println(map.get(1.0));
        System.out.println(map.get(35.0));
        System.out.println("**********************************************");

        System.out.println("Displaying all the entry in map");
        map.display();
        System.out.println("**********************************************");

        System.out.println("Removing the entry with key 35");
        map.remove(35.0);
        map.display();
        System.out.println("**********************************************");

        System.out.println("Adding duplicate key 1 in map");
        map.put(1.0, "Ivan III Rurik");
        System.out.println("**********************************************");

        System.out.println("Displaying all the entry in map again");
        map.display();
        System.out.println("**********************************************");

        System.out.println("Adding entry with key 46 in map");
        map.put(46.0, "Joe Biden");
        map.display();

    }
}
