package javaStart.lesson_7;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Artom";
//        String s2 = "Artem";
//        String s3 = new String("Artem");
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);
        System.out.println(s1.charAt(0));
char[]chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));
        chars[3]='e';
        String newS1 = new String(chars);
        System.out.println(newS1);

    }
}
