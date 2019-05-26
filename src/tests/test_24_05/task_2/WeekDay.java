package tests.test_24_05.task_2;

public enum WeekDay {
    MONDAY("5 lessons"),
    TUESDAY("5 lessons"),
    WEDNESDAY("5 lessons"),
    THURTSDAY("5 lessons"),
    FRIDAY("5 lessons"),
    SATURDAY("Day off"),
    SUNDAY("Day off");

    String numberOfLessons;

    WeekDay(String numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public String getNumberOfLessons() {
        return numberOfLessons;
    }
}
