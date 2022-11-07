package prac20.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax<T extends Number> implements Comparator<T> {

    List<T> array;

    MinMax(List<T> arr) {
        array = arr;
    }

    public static Number findMax(List<Number> arr) {
        return 0;
    }

    @Override
    public int compare(Number o1, Number o2) {
        return 0;
    }

    public static void main(String[] args) {
        MinMax<Number> list = new MinMax<>(
                Arrays.asList(4,5,6,6,5,3.745,456.7,325f)
        );

        System.out.println(findMax(list.array));
    }
}

//    List<T> array;
//
//    MinMax(List<T> arr) {
//        array = arr;
//    }
//
//    public static Number findMax(List<Number> arr) {
//        Number max = null;
//        for (int i = 0; i < arr.size()-1; i++) {
//            if(arr.get(i) > max)
//                max = arr.get(i);
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        MinMax<Number> list = new MinMax<>(
//                Arrays.asList(4,5,6,6,5,3.745,456.7,325f)
//        );
//
//        System.out.println(findMax(list.array));
//    }