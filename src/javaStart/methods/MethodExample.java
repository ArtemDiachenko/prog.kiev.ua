package javaStart.methods;

public class MethodExample {
    public static void main(String[] args) {
        int x = getMin(10, 20);
        int y = getMin(30, 40);
        System.out.println(x + y);

    }
        // Creator
        public static int getMin(int a, int b){
            int min;
            if (a < b) {
                min = a;
            } else {
                min = b;
            }
            return min;
        }

}
