package lessons.lesson19.practice_2.task_1;

import java.util.function.Function;

public class IntegerToString {
    private static  final String STRING = "рублей";

    public static void main(String[] args) {
        // Function<Integer, String> func = number -> number + " rub";
        Function <Integer, String> integerToString = (integer) -> {
            String integer1 = integer.toString();
            String function = integer1 + " " + STRING;

            return function;
        };
        Integer integer = 5;
        String string = integerToString.apply(integer);
        System.out.println(string);
    }
}
