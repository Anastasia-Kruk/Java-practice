package by.stormnet.hw_5.task_2;

public class ArrayString {
    public static void main(String[] args) {
        String wordFind = "apple";

        System.out.println(contains(args, wordFind));
    }

    static boolean contains(String[] array, String word) {
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                result = true;
            }
        }
        return result;
    }

}
