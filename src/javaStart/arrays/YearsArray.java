package javaStart.arrays;

import java.util.Arrays;

public class YearsArray {
    public static void main(String[] args) {
        int[] years = new int[19];

//        for (int i = 0; i < years.length; i++) {
//            years[i] = 2000 + i;
//        }

//        int filler = 2000;
//        for (int i = 1; i < years.length; i++) {
//            years[i] = filler++;
//        }

        for (int filler = 2000; filler <= 2018; filler++) {
            years[filler - 2000] = filler;
        }
        System.out.println(Arrays.toString(years));
    }
}
