package javaStart.lesson_3;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
//        int age;
//        String name;
//
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Input your name");
//        name = sc.nextLine();
//        System.out.println("Not bad but input your age");
//        age = sc.nextInt();
//        System.out.println("Your name is " + name + " and your age is " + age);
        System.out.println("Input raduis");
        double r = sc.nextDouble();

        System.out.println("Area of circle " + Math.PI * Math.pow(r,2));

    }
}