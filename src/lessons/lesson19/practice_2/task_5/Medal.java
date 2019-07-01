package lessons.lesson19.practice_2.task_5;

public enum Medal {
    GOLD(1), SILVER(2), BRONZE(3);

    int numberOfPlace;

    Medal(int numberOfPlace) {
        this.numberOfPlace = numberOfPlace;
    }

    public int getNumberOfPlace() {
        return numberOfPlace;
    }
}
