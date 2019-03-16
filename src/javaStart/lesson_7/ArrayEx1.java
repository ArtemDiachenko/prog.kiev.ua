package javaStart.lesson_7;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[]array = new int [10];
        int[]array2 = {1,2,3,4,5,6,8};

        array[0]= 100500;
        array[5] = 666;
        int[]arr = new int[100];
        for (int i = 0; i < arr.length ; i++) {

            if (i >=5 && i <=10 ){
                continue;
            }
            arr[i] = i+1;
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));

int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
