package javaStart.lesson_3;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        if (price < money) {
            System.out.println("I will take it");
        } else {
            System.out.println("I am ");
        }

        String result = price < money ? "I will take it" : "I am poor man";
    }
}
