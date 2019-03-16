package JavaOOP.Lesson1.Lesson7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread implements Runnable {
    private SimpleDateFormat sdf;

    public ClockThread(String format) {
        sdf = new SimpleDateFormat(format);
    }

    public ClockThread() {
        sdf = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for (; !th.isInterrupted();) {
            System.out.println(sdf.format(new Date()));
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Clock thread stopped");
    }
}
