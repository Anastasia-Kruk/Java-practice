package lessons.lesson19.practice.task_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePicker {
    public static void main(String[] args) {
        Operationable operation = () -> {
            DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            return sdf.format(date);
        };
        System.out.println(operation.getDateToday());
    }
}
