package javaStart.lesson_7;

public class Geometry {
    public static void main(String[] args) {
////        double a0 = rectangleArea(-10, 20);
//        double a1 = rectangleArea(10, 20); // 200
//        double a2 = rectangleArea(40, 30); // 1200
//
////        System.out.println("a0 = " + a0);
//        System.out.println("a1 = " + a1);
//        System.out.println("a2 = " + a2);
//
//        System.out.println(circleArea(10)); // ~ 314
//        System.out.println(circleArea(20)); // ~ 1256
        test();
    }
public static void test(){
    System.out.println(rectangleArea(10,20));
    System.out.println(circleArea(30));
}

    public static double rectangleArea(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("negative size");
        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("negative radius");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
