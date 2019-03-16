package javaStart.methods;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        if (value > 10){
            getSuccess();
        }else {
            getFalt();
        }

    }
    public static void getSuccess(){
        System.out.println("SUCCESS!!!!");
    }

    public static void getFalt(){
        System.out.println("FALTTTTTTTTT!!!!!");
    }

}
