package JavaOOP.Lesson1.Lesson7;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FactorialThread implements Runnable {
    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        for (int i = 0; i <=this.number ; i++) {
            System.out.println(thread.getName() + " " + i + "!= " + calculateFactorial(i));
        }
    }
    private BigInteger calculateFactorial(int number) {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
