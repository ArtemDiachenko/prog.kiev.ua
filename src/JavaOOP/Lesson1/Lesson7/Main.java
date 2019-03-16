package JavaOOP.Lesson1.Lesson7;

public class Main {
    public static void main(String[] args){
        //2000

        Thread thread1 = new Thread(new FactorialThread(20), "first");
        Thread thread2 = new Thread(new FactorialThread(20), "second");
        Thread thread3 = new Thread(new FactorialThread(20), "third");
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is stop");
    }
}
