package javaStart.lesson4;

public class IfElseEx2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;

        if(a < b){
            System.out.println("a < b");
        } else {
            if (a > b){
                System.out.println("a > b");
            }else {
                System.out.println("a == b");
            }
        }
    }
}
