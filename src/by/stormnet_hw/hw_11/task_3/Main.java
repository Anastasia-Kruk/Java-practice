package by.stormnet_hw.hw_11.task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building("Ostroshitskaya", 1));
        buildings.add(new Building("Ostroshitskaya", 2));
        buildings.add(new Building("Bachilo", 8));
        buildings.add(new Building("Akademicheskaya", 4));
        buildings.add(new Building("Mogilevskaya", 3));

        Comparator<Building> comparator = new BuildingStreetNameComparator().thenComparing(new BuildingHouseEntranceComparator());

        TreeSet<Building> houses = new TreeSet<>(comparator);
        houses.addAll(buildings);

        System.out.println(houses );
    }
}
