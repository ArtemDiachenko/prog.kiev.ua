public class MyExeption extends Exception {
    public MyExeption(Throwable cause) {
        super(cause);
    }

    public MyExeption(String message) {
        super(message);
    }
}
class MyClass1{
    public static void myMet() throws MyExeption{
        System.out.println("wertg");
    }

    public static void main(String[] args) {
        try {
            myMet();
        } catch (MyExeption myExeption) {
            myExeption.printStackTrace();
        }
    }
}
