package javaStart.lesson_3;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Artem";
        String s2 = "Artem";
        String s3 = new String("Artem");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);

    }
}
