package javaStart.lesson_7;

import java.util.Arrays;

public class Zebra {
    public static void main(String[] args) {
        String[] zebra1 = createZebra(4);
        System.out.println(Arrays.toString(zebra1));

        String[] zebra2 = createZebra(5);
        System.out.println(Arrays.toString(zebra2));

        String[] zebra3 = createZebra(0);
        System.out.println(Arrays.toString(zebra3));

//        String[] zebra4 = createZebra(-10);
//        System.out.println(Arrays.toString(zebra4));
    }

    public static String[] createZebra(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        String[] zebra = new String[size];
        for (int i = 0; i < zebra.length; i++) {
            if (i % 2 == 0) {
                zebra[i] = "black";
            } else {
                zebra[i] = "white";
            }
        }
        return zebra;
    }
}
