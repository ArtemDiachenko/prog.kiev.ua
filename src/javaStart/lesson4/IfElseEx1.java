package javaStart.lesson4;

public class IfElseEx1 {
    public static void main(String[] args) {
        int a =20;
        int b = 30;
        String name = a > b ? "Lesy" : "Artem";
        System.out.println(name);
        String name1;

        if (a>b){
            name1 = "Lesy";
        }else {
            name1 = "Artem";        }

    }
}
