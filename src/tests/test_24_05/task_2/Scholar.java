package tests.test_24_05.task_2;

import java.util.Calendar;

public class Scholar {
    public static void main(String[] args) {
        int dayOfWeek = Calendar.DAY_OF_WEEK;
        String schedule = "Day off";
        WeekDay weekDay = WeekDay.MONDAY;
        //Очень много switch case :)
        //Думаю, какой-то один здесь точно лишний)
        switch (dayOfWeek) {
            case 1:
                weekDay = WeekDay.MONDAY;
                schedule = WeekDay.MONDAY.numberOfLessons;
                break;
            case 2:
                weekDay = WeekDay.TUESDAY;
                schedule = WeekDay.TUESDAY.numberOfLessons;
                break;
            case 3:
                weekDay = WeekDay.WEDNESDAY;
                schedule = WeekDay.WEDNESDAY.numberOfLessons;
                break;
            case 4:
                weekDay = WeekDay.THURTSDAY;
                schedule = WeekDay.THURTSDAY.numberOfLessons;
                break;
            case 5:
                weekDay = WeekDay.FRIDAY;
                schedule = WeekDay.FRIDAY.numberOfLessons;
                break;
            case 6:
                weekDay = WeekDay.SATURDAY;
                schedule = WeekDay.SATURDAY.numberOfLessons;
                break;
            case 7:
                weekDay = WeekDay.SUNDAY;
                schedule = WeekDay.SUNDAY.numberOfLessons;
                break;
        }
        ScholarSchedule scholar = new ScholarSchedule(weekDay, schedule);
        scholar.info();
    }

}
