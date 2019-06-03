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

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseEntrance() {
        return houseEntrance;
    }

    public void setHouseEntrance(int houseEntrance) {
        this.houseEntrance = houseEntrance;
    }

    @Override
    public int compareTo(Building o) {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("streetName='").append(streetName).append('\'');
        sb.append(", houseEntrance= ").append(houseEntrance);
        sb.append('}'+ "\n");
        return sb.toString();
    }
}
