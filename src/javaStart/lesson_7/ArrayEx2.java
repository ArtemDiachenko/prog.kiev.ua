package javaStart.lesson_7;


import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6};
        int[]b = new int[5];
        int[]c = new int[5];

        b[2] = 100500;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b = a;
        b[2] = 666;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(c));
        c = b;
        System.out.println("===================");
        System.out.println(Arrays.toString(c));


    }
}
