package by.stormnet_hw.hw_11.task_3;

import java.util.Comparator;

public class BuildingStreetNameComparator implements Comparator<Building> {
    @Override
    public int compare(Building a, Building b) {
        return a.getStreetName().compareTo(b.getStreetName());
    }
}
