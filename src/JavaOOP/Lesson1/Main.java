package JavaOOP.Lesson1;

import JavaOOP.Lesson1.Lesson9.ExampleLesson9;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      //  Car carOne = new Car(1500, 1960, 0 , 8);
        String [] ar = {"String", "A"};
        Integer [] arr = {5,43,2,1, 1,1, 5,43};
        Map<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

//        System.out.println(ExampleLesson9.findMin(ar));
//        System.out.println(ExampleLesson9.findMin(arr));
    }
}
