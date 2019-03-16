package javaStart.lesson5_6;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
//        int day = 1; // (1)
//
//        while (day <= 10) { // (2)
//            System.out.println(day + ": Work");
//            day = day +2; // (3)
//        }
//        System.out.println("Yahoooooo");

        Scanner sc = new Scanner(System.in);
        String n = "";
            while (!n.equalsIgnoreCase("Exit")) {
            System.out.println("Enter Exit if want exit");
            n = sc.nextLine();
        }

//                for (int i = n; i >= 0; i = i - 2) {
//                    System.out.print(i + " ");
//                }
//        int n = 5;
//        int sum = 0;
//        for (int i = 0; i <= 5; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
    }
}

