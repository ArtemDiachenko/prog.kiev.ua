package javaStart.lesson5_6.practice;

import java.util.Scanner;


//Задача №2
// 1)С терминала ввести количство пирогов
// 2)Вывести в терминал сообщение "I have (ваше число) cakes"
// 3)В цикле вывести "I have eaten a cake. n are left."














public class Cakes2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cakes: ");
        int cakes = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes.");
        for (int cakesLeft = cakes - 1; cakesLeft >= 0; cakesLeft--) {
            System.out.println("I have eaten a cake. "
                    + cakesLeft + " are left.");
        }
    }
}

