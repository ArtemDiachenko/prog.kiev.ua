package JavaOOP.Lesson1.Lesson3.Agregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anton", "Pupkin");
        Student student2 = new Student("Artem", "Pupkin");
        Student student3 = new Student("Dima", "Pupkin");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Group group1 = new Group(1, "Group", students);
        System.out.println(group1);
        group1 = null;

    }
}
