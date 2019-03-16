package JavaOOP.Lesson1.Lesson4.Interface;

import java.util.Comparator;

public class Cat implements Ibite {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isTesty() {
        return this.age <= 2;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}


//public int compareTo(Object o){
//    Cat obj = (Cat) o;
//    if(this.age > ((Cat) o).age){
//        return 1;
//    }else if(this.age < ((Cat) o).age){
//        return -1;
//    }else {
//        return 0;
//    }
//}
