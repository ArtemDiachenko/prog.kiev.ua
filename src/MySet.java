import java.util.HashMap;

public class MySet <E> {
    private HashMap<E, Object> map;

    private int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;
    public void add(E e){
        count++;
        map.put(e, new Object());
    }
}
