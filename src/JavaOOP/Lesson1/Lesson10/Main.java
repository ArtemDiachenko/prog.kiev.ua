package JavaOOP.Lesson1.Lesson10;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrr = Arrays.asList(9,6,4,76,2,4,6,1);
        TreeSet<Integer> set = new TreeSet<>(arrr);
        System.out.println(set);

    }
}
