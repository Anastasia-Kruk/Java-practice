package by.stormnet_hw.hw_11.task_3;

import java.util.Comparator;

public class BuildingHouseEntranceComparator implements Comparator<Building> {
    @Override
    public int compare(Building a, Building b) {
        if (a.getHouseEntrance() > b.getHouseEntrance()) {
            return 1;
        } else if (a.getHouseEntrance() < b.getHouseEntrance()) {
            return -1;
        } else
            return 0;
    }
}
