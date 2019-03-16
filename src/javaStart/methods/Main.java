package javaStart.methods;

import java.util.Arrays;

public class Main {

    public static void test(){
        System.out.println("Test");
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = getSum(a,b,30);
        System.out.println(result);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        changeArra(arr);
        System.out.println(Arrays.toString(arr));
        Object[]array = new Object[10];
    }
    public static int getSum(int firstElement, int secondElement) {
        test();
        return firstElement + secondElement;
    }
    public static void changeArra(int[] arr){
        arr[0] = 100500;
    }
    public static double getSum(double f, double y) {
        return f + y;
    }
    public static int getSum(int f, int y, int w) {
        return f + y + w;
    }
}
//        System.out.println(result);
//        int c = 50;
//        int v = 60;
//        int result2 = getSum(c,v);
//        System.out.println(result2);
//
//        System.out.println(getSum(1,2,3));
//        System.out.println(getSum(1.1, 1.1));
//        int[] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//        changeArra(arr);
//        System.out.println(Arrays.toString(arr));