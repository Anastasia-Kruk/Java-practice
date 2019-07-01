package lessons.lesson19.practice_2.task_6;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.function.Consumer;


// new TreeSet<>(сюда можно передать компаратор)
public class StringReverse {
    public static void main(String[] args) {
        Consumer<TreeSet> reverseString = (string) -> {
            TreeSet<String> str = new TreeSet<>();
            str.addAll(string);
            NavigableSet<String> reverse = str.descendingSet();
            System.out.println(reverse);
        };

        TreeSet<String> string = new TreeSet<>();
        string.add("Apple");
        string.add("Peach");
        string.add("Lemon");
        string.add("Watermelon");
        string.add("Melon");
        string.add("Nectarine");

        System.out.println(string);
        reverseString.accept(string);


    }
}
