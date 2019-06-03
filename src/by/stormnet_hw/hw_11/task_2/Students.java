package by.stormnet_hw.hw_11.task_2;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        List<String> surname = new ArrayList<>();
        surname.add("Ivanov");
        surname.add("Petrov");
        surname.add("Sidorov");
        surname.add("Tatur");
        surname.add("Ivanov");
        surname.add("Kruk");

        Map<String, Integer> students = new TreeMap<>();

        for (String elem : surname) {
            if (students.containsKey(elem)) {
                students.put(elem, students.get(elem)+1);
            }else {
                students.put(elem, 1);
            }
        }
        System.out.println(students);
    }
}
