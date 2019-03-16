package javaStart.arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 50};

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            System.out.println(elem);
        }
        System.out.println();

        for (int elem : array) { // for-each (90%)
            System.out.println(elem);
        }
        System.out.println(Arrays.toString(array));

        // 1. Read only.
        // 2. Straight order.
        // 3. Works with elems, not indexes.
    }
}
