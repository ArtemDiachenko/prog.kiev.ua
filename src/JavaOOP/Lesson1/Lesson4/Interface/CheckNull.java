package JavaOOP.Lesson1.Lesson4.Interface;

import java.util.function.ObjLongConsumer;

public interface CheckNull {
    public int NOT_NULL = 7;

    public static int checkNull(Object a, Object b){
        if (a == null && b != null){
            return 1;
        }
        if (a != null && b == null){
            return -1;
        }
        if (a == null && b == null){
            return 0;
        }
        return NOT_NULL;
    }
}
