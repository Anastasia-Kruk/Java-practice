package by.stormnet_hw.hw_11.task_4;

import java.util.*;

public class ReversOfNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        NavigableSet<Integer> revers = numbers.descendingSet();
        System.out.println(revers);
    }
}
