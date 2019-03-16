package JavaOOP.Lesson1.Lesson4;

import javax.swing.*;

public class ExceptionExample2 {
    public static void main(String[] args) {
        double a = 0;
        for (;;){
            try {
                a = Double.valueOf(JOptionPane.showInputDialog("Input double format"));
                break;
            }catch (NumberFormatException | NullPointerException e){
                e.printStackTrace();
                break;
            }
        }
        System.out.println("This is your number --> " + a);
        JOptionPane.showMessageDialog(null, a + " <--This is your number");


    }
}


// старк трейс если нечего в кетче
// если нажать cancel
// Exception в начале другие типы идут после пример написать