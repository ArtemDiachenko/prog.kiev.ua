package javaStart.lesson_3;

public class MathExample {
    public static void main(String[] args) {
        double a = 11;
//    int b = a%2;
//    b = --a;

//        System.out.println(b);
        System.out.println(a%2 == 0);
        double result = Math.PI*Math.pow(a,2);
        System.out.println(result);
        System.out.println("++++++++++++++++");

        int c = 12;

        int v = c;

        System.out.println("result -> " + v);

        int d = 25;

        System.out.println("d++ = " + ((d++) + c));
        System.out.println(d);
        System.out.println("++d = " + (++d));


}



}
