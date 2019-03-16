package javaStart.lesson_7;

import java.util.Arrays;

public class PositivElements {
    public static void main(String[] args) {
        int[] array = {10, -2, 20, 0, 100500};
        int[] positiveElems = findPositiveElems(array);
        System.out.println(Arrays.toString(positiveElems));
    }

    public static int[] findPositiveElems(int[] array) {
        int[] arr = new int[array.length];
        int[] result;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (array[i] < 0) {
                continue;
            }
            arr[i] = array[i];
            if (arr[i] > 0) {
                length++;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        result = new int[length];
        Reverse.reverse(arr);
        System.out.println(Arrays.toString(arr));
        result = Arrays.copyOf(arr, result.length);
        return result;
    }
}
