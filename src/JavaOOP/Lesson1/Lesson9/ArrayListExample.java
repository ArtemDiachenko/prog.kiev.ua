package JavaOOP.Lesson1.Lesson9;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arra = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arra.add(i);
            System.out.println(arra.get(i));
        }
        for (int i = 0; i < 5; i++) {
            arra.add(i);
            System.out.println(arra.get(i));
        }
        HashSet<Integer>set =new HashSet<>(arra);
        List<Integer> arra1 = new ArrayList<>(set);
        System.out.println();
    }
}
