package javaStart.lesson_3;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");

        String input = scanner.nextLine(); //"1234"

        int i = Integer.parseInt(input);

        System.out.println(i + 100500);

    }
}
