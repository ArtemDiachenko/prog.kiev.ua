package JavaOOP.Lesson1.Lesson2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(4,6,false, "Milk",
                "Vaska", "Sibirian");

        System.out.println(cat1);


        Cat cat2 = new Cat(99,6,false, "Milk",
                "Vaska", "Sibirian");
        cat2.setV("Gav-gaaaaav yyyyyyyyyyyyy");
String voice = cat2.getV();
cat2.getVoicee("sdfg");
    }
}
