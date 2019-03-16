package JavaOOP.Lesson1.Lesson4.Interface;

public class Dog implements Ibite{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bite(Ibite object) {
            if (this == object){
                System.out.println("I bite myself!!!");
                return;
            }
        System.out.println("Bite ->" + (object.isTesty() ? " It was good" : "It was bad"));
    }

    @Override
    public boolean isTesty() {
        return true;
    }
}
