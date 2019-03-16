package JavaOOP.Lesson1.Lesson3;

public class Tryex {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Test");}
//        } finally {
//            System.out.println("Test1");
//        }
        System.out.println("Test2");
    }
}
