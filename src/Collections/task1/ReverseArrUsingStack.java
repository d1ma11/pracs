package Collections.task1;

import java.util.Iterator;
import java.util.Stack;

public class ReverseArrUsingStack<T> {
    public static <T> void reverseArr(T[] arr) {
        Stack<T> arrStack = new Stack<>();
        for(T elem : arr) {
            arrStack.push(elem);
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = arrStack.pop();
        }
        System.out.println();
    }

    public static <T> void print(T[] arr) {
        for(T elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,0};
        print(arr);
        reverseArr(arr);
        print(arr);
    }
}
