package javaStart.lesson5_6;

public class ForExample {
    public static void main(String[] args) {
        // 10..20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("_________________");
        // 60..50
        for (int n = 60; n >= 50; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("_________________");
//        // 10, 20, 30, ... 100
        for (int n = 10; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("_________________");
//        // 1000, 900, 800, ... 100
        for (int n = 1000; n >= 100; n -= 100) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
