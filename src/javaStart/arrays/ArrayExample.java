package javaStart.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
//        int[] ints;
//        double[] doubles;
//        String[] names;
//
//        int[] array = new int[5]; // 4B * 5 = 20B
//        int[] array2 = {30, 45, 24, 18, 53};
//
//        int len = array.length;
//        array[2] = 24;
//        System.out.println(array[6]);
//        Arrays.
//        System.out.println("len = " + len);
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(array[2]);
//        array[2] = 100500;
//        System.out.println(Arrays.toString(array));

//        int[] mas = new int[10];
//int sum =0;
//        for (int i = 0; i <mas.length ; i++) {
//           sum = sum + mas[i];
//        }
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        b=a;
        System.out.println(Arrays.toString(a));
        b[2] = 100500;
        System.out.println(Arrays.toString(a));
    }
}

