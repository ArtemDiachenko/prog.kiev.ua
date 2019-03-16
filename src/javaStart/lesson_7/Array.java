package javaStart.lesson_7;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int sum = 0;
//
////        for (int i = 0; i < a.length; i++) {
////            sum = sum + a[i];
////            System.out.println(sum);
////        }
//        for (int i:a) {
//            sum = sum +i;
//        }
//        System.out.println(sum);

//        System.out.println(Arrays.toString(a));
//        changeElement(a);
//        System.out.println(Arrays.toString(a));
        int a = 2000;
        System.out.println(a);
       a = changeElement(a);
        System.out.println(a);
    }

    public static void changeElement(int[] a) {
        a[1] = 100500;
    }
    public static int changeElement(int a) {
        System.out.println(" ------> "+a);
        a = 10;
        return a;
    }
}
