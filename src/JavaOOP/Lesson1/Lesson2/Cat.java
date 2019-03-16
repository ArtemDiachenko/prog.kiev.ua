package JavaOOP.Lesson1.Lesson2;

public class Cat extends Animal {
    private String name;
    private String type;
    private String v;

    public Cat(int age, double weight, boolean sex, String ration, String name, String type) {
        super(age, weight, sex, ration);
        this.name = name;
        this.type = type;
    }



    public void getVoicee(String voice) {
        System.out.println(voice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setV(String v) {
        this.v = v;
    }
    public String getV() {
        return v;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                super.toString();
    }
}
