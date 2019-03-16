package javaStart.lesson_3;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\u2602';
        char c3 = 100;
        char c4 = '\\'; // \n, \t, \\, \", \'

        // "D:\\"
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\"D:\\\\\"");
        System.out.println(c1);
        System.out.println("Hello, ☃");
        System.out.println("Hello, \uD83E\uDDDD");
        System.out.println(c2);
    }
}
