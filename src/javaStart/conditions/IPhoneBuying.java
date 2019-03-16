package javaStart.conditions;

import java.util.Scanner;

public class IPhoneBuying {
    public static void main(String[] args) {
        long iPhonePrice = 999;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Are you happy? (yes/no) ");
        boolean isHappy = scanner.next().equals("yes");

        System.out.print("Does you girlfriend want? (yes/no) ");
        boolean girlfriendWants = scanner.next().equals("yes");

        if ((!isHappy || girlfriendWants) && money >= iPhonePrice) {
            System.out.println("Buying iPhone");
            money -= iPhonePrice; // money = money - iPhonePrice
        } else {
            System.out.println("Sadly :(");
        }

        System.out.println("$" + money + " left");
    }
}
