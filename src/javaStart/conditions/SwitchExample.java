package javaStart.conditions;

import java.util.Scanner;

public class  SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of weak");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понидельник");

            case 2:
                System.out.println("Втр");

            case 3:
                System.out.println("Сред");
                break;
            case 4:
                System.out.println("Чет");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суб");
                break;
            case 7:
                System.out.println("Вос");
                break;
            default:
                System.out.println("unknown day ");
        }
    }
}
