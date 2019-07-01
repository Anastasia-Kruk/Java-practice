package by.stormnet_hw.hw_11.task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Building> houses = new TreeSet<>();
        houses.add(new Building("Ostroshitskaya", 1));
        houses.add(new Building("Ostroshitskaya", 2));
        houses.add(new Building("Bachilo", 8));
        houses.add(new Building("Akademicheskaya", 4));
        houses.add(new Building("Mogilevskaya", 3));

        System.out.println(houses );
    }
}
