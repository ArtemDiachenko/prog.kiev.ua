package javaStart.lesson5_6.practice;

import java.util.Scanner;

//Задача №4
// 1)С терминала ввести количство пирогов каждому человеку равное
// 2)С терминала ввести количество людей
// 3)В цикле вывести "I'm n person. I have n cakes."
// 4)В это же цикле вывести "I'm n person. I have eaten n cakes."
// Пример вывода:
// I'm 1 person. I have 3 cakes.
//I'm 1 person. I have eaten 1 cake.
//I'm 1 person. I have eaten 2 cake.
//I'm 1 person. I have eaten 3 cake.
// I'm 2 person. I have 3 cakes.
//I'm 2 person. I have eaten 1 cake.
//I'm 2 person. I have eaten 2 cake.
//I'm 2 person. I have eaten 3 cake.









public class Cakes4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt(); // 3

        System.out.print("Enter number of cakes for each person: ");
        int cakes = scanner.nextInt(); // 5

        for (int person = 1; person <= people; person++) {

            System.out.println("I'm " + person + " person. I have " + cakes + " cakes.");
            for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
                System.out.println("I'm " + person + " person. I have eaten " + cakeIndex + " cake.");
            }
            System.out.println();
        }
    }
}
