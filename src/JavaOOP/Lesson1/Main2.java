package JavaOOP.Lesson1;

import JavaOOP.Lesson1.Lesson2.Cat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "two");
        map1.put(1, "one");
        map1.put(3, "three");
        map1.put(6, "six");

map1.replaceAll((k, v) -> v.toUpperCase() +" "+ k);


//        for (Map.Entry<Integer, String> entry: map1.entrySet()) {
//            System.out.println("map key -> " + entry.getKey() + "; map value -> " + entry.getValue());
//        }
//        System.out.println("+++++++++++++++++");
       map1.forEach((k,v) -> System.out.println("key -> " + k + "; value -> " + v));

//        int[] array = {1, 2, 4, 7, 3, 1, 5, 7, 3, 7};
//
//        Map<Integer, Integer> map2 = new HashMap<>();
//
//        for (int i = 0; i < array.length; i++) {
//            if (map2.containsKey(array[i])) {
//                map2.put(array[i], map2.get(array[i]) + 1);
//            } else {
//                map2.put(array[i], 1);
//            }
//        }
//
//        map2.forEach((k, v) -> System.out.println(k + " -> " + v));


    }



}

















