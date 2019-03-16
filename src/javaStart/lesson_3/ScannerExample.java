package javaStart.lesson_3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String phone;
        name = scanner.next();
        phone = scanner.next();

        int realPhone = Integer.parseInt(phone);
        realPhone +=20;
        System.out.println("My name is " + name + " and phone " + realPhone);
    }
}
