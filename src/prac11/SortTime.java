package prac11;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SortTime {
    public static void main(String[] args) {

        long start = System.nanoTime();

        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);
    }
}
