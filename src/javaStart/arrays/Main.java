package javaStart.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array;
        array = new int[12/7];

        // 1) с помощю сканера можна ли вставить длину масива
        int [] qw = new int[12];
        qw [5] = 9999;
        System.out.println(Arrays.toString(qw)); // что выведит?

        //2) что будет если тип String и только одно значения в середине.
        for (int i = 0; i <12 ; i++) {
            System.out.println(5000+ (int)Math.random()*10000);
        }
        int a = 5000; // Начальное значение диапазона - "от"
        int b = 10000; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);
    }
}
