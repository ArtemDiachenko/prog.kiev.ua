package javaStart.lesson5_6;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        while (true){
            System.out.println("Count " + i);
            System.out.println(n);
//            n = n -1;
            ++i;
        }
    }
}
