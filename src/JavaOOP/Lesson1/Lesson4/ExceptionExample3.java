package JavaOOP.Lesson1.Lesson4;

public class ExceptionExample3 {
    public static void main(String[] args) {
        try{
            System.out.println(7/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
