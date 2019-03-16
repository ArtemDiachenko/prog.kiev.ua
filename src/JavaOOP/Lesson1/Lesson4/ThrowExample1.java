package JavaOOP.Lesson1.Lesson4;

import javaStart.methods.Main;

public class ThrowExample1 {
    public static void main(String[] args) {
        try {
            System.out.println(getCircleArea(5));
            System.out.println(getCircleArea(-1));
            System.out.println(getCircleArea(2));
            System.out.println(getCircleArea(-1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static double getCircleArea(double r) throws IllegalArgumentException, ArithmeticException {
        if (r <= 0) {
            throw new IllegalArgumentException("Negative radius");
        } else if (r <= 1) {
            throw new ArithmeticException("Test");
        }
        return Math.PI * Math.pow(r, 2);
    }
}


// null часто

// Json
//1) JSON -> String
//2) String -> [] array
//3) [] array -> обработать
//4) [] array -> DB
