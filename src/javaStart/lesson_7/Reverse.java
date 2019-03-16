package javaStart.lesson_7;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 960};
        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
