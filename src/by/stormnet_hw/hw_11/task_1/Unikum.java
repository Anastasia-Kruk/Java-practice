package by.stormnet_hw.hw_11.task_1;

import java.util.*;

public class Unikum {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Sergei");
        list.add("Alex");
        list.add("Damir");
        list.add("Shone");

        Set<String> names = new TreeSet<>();
        names.addAll(list);

        System.out.println(names);
    }
}
