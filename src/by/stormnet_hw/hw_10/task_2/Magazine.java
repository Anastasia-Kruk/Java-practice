package by.stormnet_hw.hw_10.task_2;

public class Magazine extends Publishing implements Cloneable {
    private int number;

    public Magazine(String name, int year, int number) {
        super(name, year);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
