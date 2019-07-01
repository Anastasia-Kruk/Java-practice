package by.stormnet_hw.hw_11.task_3;

public class Building implements Comparable<Building> {
    private String streetName;
    private int houseEntrance;

    public Building(String streetName, int houseEntrance) {
        this.streetName = streetName;
        this.houseEntrance = houseEntrance;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseEntrance() {
        return houseEntrance;
    }

    @Override
    public int compareTo(Building b) {
        int comperedStreet = this.getStreetName().compareTo(b.getStreetName());
        if (comperedStreet == 0) {
            if (this.getHouseEntrance() > b.getHouseEntrance()) {
                return 1;
            } else if (this.getHouseEntrance() < b.getHouseEntrance()) {
                return -1;
            } else
                return 0;
        }
        return comperedStreet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("streetName='").append(streetName).append('\'');
        sb.append("houseEntrance= ").append(houseEntrance);
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
}
