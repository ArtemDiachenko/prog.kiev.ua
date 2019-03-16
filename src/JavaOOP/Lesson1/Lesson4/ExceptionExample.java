package JavaOOP.Lesson1.Lesson4;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getElement(arr, 3));
        System.out.println(getElement(arr, 7));
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();
    }

    public static int getElement(int[] arr, int index) {
            int result = 0;
        try {
            result = arr[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Uncorrected index");
        }
        return result;
    }
}





// Разный тип исключения
// c finally и без


