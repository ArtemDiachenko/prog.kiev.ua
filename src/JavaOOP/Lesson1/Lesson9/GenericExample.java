package JavaOOP.Lesson1.Lesson9;

public class GenericExample <T extends Number> {
    private T object;

    public GenericExample(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenericExample{" +
                "object=" + object +
                '}';
    }
}
