package tests.test_24_05.task_2;


public class ScholarSchedule {
    private WeekDay weekDay;
    private String schedule;


    public ScholarSchedule(WeekDay weekDay, String schedule) {
        this.weekDay = weekDay;
        this.schedule = schedule;
    }

    public void info() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURTSDAY:
            case FRIDAY:
                System.out.println("Today is " + weekDay + ". Need to go to school, it is " + schedule + ".");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Today is " + weekDay + ". It is a " + schedule + ".");
                break;
        }
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
}
