package javaStart.arrays;

import java.util.Arrays;

public class ReversedYearsArray {
    public static void main(String[] args) {
        int[] years = new int[19];

        int filler = 2018;
        for (int i = 0; i < years.length; i++) {
            years[i] = filler;
            filler--;
        }

        System.out.println(Arrays.toString(years));
    }
}
