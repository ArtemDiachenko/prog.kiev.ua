import JavaOOP.Lesson1.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5, 7, 4, 2, 8, 1, 5, 6};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()
             ) {
            System.out.println("Key " + mapEntry.getKey() + " Value " +  mapEntry.getValue());
        }

        Set<String> set = new HashSet<>();
map.forEach((k, v)->{
    System.out.println(k + " " + v);
});

        for (Map.Entry<Integer, Integer> test: map.entrySet()
             ) {
            System.out.println(test.getKey());
        }

List<Integer> lista = new ArrayList<>();
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println("_____________________");
        List<Integer> arrList = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 3);
        System.out.println(arrList);
        Set<Integer> setList = new TreeSet<>(arrList);
        System.out.println(setList);
        System.out.println("++++++++++++++++");
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(arr[i])){
                map1.put(arr[i], map1.get(arr[i]) + 1);
            }else {
                map1.put(arr[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> m: map1.entrySet()
             ) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();
        map1.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
