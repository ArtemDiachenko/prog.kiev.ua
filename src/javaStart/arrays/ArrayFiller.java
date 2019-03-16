package javaStart.arrays;

import java.util.Arrays;

public class ArrayFiller {
    public static void main(String[] args) {
        int[] array = new int[5];

        // i = 0...9
        int filler = 3;
        Arrays.fill(array, filler);

        System.out.println(Arrays.toString(array));
    }

//    public static void fill(int[] array, int filler) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = filler;
//        }

}
