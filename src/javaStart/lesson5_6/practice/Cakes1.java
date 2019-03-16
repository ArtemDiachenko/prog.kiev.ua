package javaStart.lesson5_6.practice;

import java.util.Scanner;

//Задача №1
// 1)С терминала ввести количство пирогов
// 2)Вывести в терминал сообщение "I have (ваше число) cakes"
// 3)В цикле вывести "I have eaten n cake." c 1 до вашего числа














public class Cakes1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cakes: ");
        int cakes = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes.");
        for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
            System.out.println("I have eaten " + cakeIndex + " cake.");
        }
    }
}
