package javaStart.lesson_7;

public class Words {
    public static void main(String[] args) {
        testTotalLength();
        testContainsEmptyWord();
    }

    public static void testContainsEmptyWord() {
        String[] arraTets = {"Artem", "", "Vika"};
        boolean result = containsEmptyWord(arraTets);
        System.out.println("------------->" + result);
        System.out.println(containsEmptyWord(new String[]{"AA", "BBB", "C"})); // false
        System.out.println(containsEmptyWord(new String[]{"AA", "", "C"})); // true
        System.out.println(containsEmptyWord(new String[]{"", "", ""})); // true
        System.out.println(containsEmptyWord(new String[]{})); // false
    }

    public static void testTotalLength() {
        String[] testArray = {"Artem", "Vika", "Andrey"};
        int result = totalLength(testArray);
        System.out.println("Это оно " + result);
        System.out.println(totalLength(new String[]{"AA", "BBB", "C"})); // 6
        System.out.println(totalLength(new String[]{"AA"})); // 2
        System.out.println(totalLength(new String[]{})); // 0
        System.out.println(totalLength(new String[]{""})); // 0
    }

    public static boolean containsEmptyWord(String[] words) {
        // iter + Enter
        for (String word : words) {
            if (word.equals("")) {
                return true;
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                return true;
            }
        }

        return false;
    }

    public static int totalLength(String[] words) {
        int totalLength = 0;
        for (String word : words) { // foreach
            totalLength = totalLength + word.length();
        }

        for (int i = 0; i < words.length; i++) { //general for
            totalLength = totalLength + words[i].length();
        }
        return totalLength;
    }
}
