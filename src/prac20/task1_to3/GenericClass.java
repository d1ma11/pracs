package prac20.task1_to3;

import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    public T t;
    public V v;
    public K k;

    GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "\n\tt class = " + t.getClass() + ", t = " + t +
                "\n\tv class = " + v.getClass() + ", v = " + v +
                "\n\tk class = " + k.getClass() + ", k = " + k +
                "\n}";
    }

    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass("dog",new Animal("Spider", 8),49.5f);
        System.out.println(genericClass);
    }
}
