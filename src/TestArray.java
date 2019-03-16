import java.util.*;

public class TestArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,5,7,8,3,7,8,8};
        Map<Integer, Integer> map = new HashMap<>();
List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 500000000 ; i++) {
            list.add(i);
        }

        System.out.println(list.size());
    }
}
