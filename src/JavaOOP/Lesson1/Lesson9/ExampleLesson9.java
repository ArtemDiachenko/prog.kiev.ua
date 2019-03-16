package JavaOOP.Lesson1.Lesson9;

public class ExampleLesson9 {
    public static <T extends Comparable<T>> T findMin(T[] array) {
        T min = array[0];
        for (T element : array) {
            if (min.compareTo(element) > 0) {
                min = element;
            }

        }
        return min;
    }
}
