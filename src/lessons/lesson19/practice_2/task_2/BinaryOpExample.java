package lessons.lesson19.practice_2.task_2;

import java.util.function.BinaryOperator;

public class BinaryOpExample {
    public static void main(String[] args) {
        BinaryOperator <Integer> binaryOperator = (x,y) -> x*y;
        int elem = 5;
        int elem_2 = 10;

        Integer multip = binaryOperator.apply(elem, elem_2);
        System.out.println(multip);
    }
}
