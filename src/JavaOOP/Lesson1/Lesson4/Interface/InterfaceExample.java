package JavaOOP.Lesson1.Lesson4.Interface;

import java.util.Arrays;
import java.util.Scanner;

public class InterfaceExample {
    public static void main(String[] args) {
//        Dog dog = new Dog("Set");
//
//        dog.bite(new Ball(10, "red"));
//        dog.bite(new Human(20, "Lars"));
//        dog.bite(new Cat("Vasy", 3));
//        dog.bite(dog);
//        dog.bite(new Plane());
 //       System.out.println("+++++++++++++++++++++++++");
        Cat cat1 = new Cat("Aasy", 3);
        Cat cat2 = new Cat("Kissy", 10);
        Cat cat3 = new Cat("Loky", 7);
        Cat cat4 = new Cat("Chig", 1);

        Cat[] cats = {cat1, cat2, cat3, cat4};
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        if (result == 1) {
            Arrays.sort(cats, (a, b) ->
                    CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b) :
                            a.getAge() - b.getAge());
        }
        if (result == 2){
           Arrays.sort(cats, (a, b) -> a.getName().compareTo(b.getName()));
        }
        System.out.println("_______________");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}


//    Cat cat1 = new Cat("Vasy", 3);
//    Cat cat2 = new Cat("Kissy", 10);
//    Cat cat3 = new Cat("Loky", 7);
//    Cat cat4 = new Cat("Chig", 1);
//    Cat[]cats = {cat1, cat2, cat3, cat4};
//        Arrays.sort(cats);
//                for (Cat cat : cats) {
//                System.out.println(cat);
//
//                }
// Arrays.sort(cats, (a,b) -> a.getAge() -b.getAge());
//Arrays.sort(cats, (a,b) ->
//        CheckNull.checkNull(a,b)!=CheckNull.NOT_NULL ? CheckNull.checkNull(a,b):
//        a.getAge()-b.getAge());