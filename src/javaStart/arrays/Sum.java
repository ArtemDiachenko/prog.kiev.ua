package javaStart.arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array = {10, 20, 50, 40};

        int sum = sum(array);

        System.out.println("sum = " + sum);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
