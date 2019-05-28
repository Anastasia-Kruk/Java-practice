package by.stormnet_hw.hw_10.task_1;

public class ArrayNumbers {
    public static <Arr extends Number> double sum(Arr[] array) {
        double sum = 0;
        for (Arr elem : array) {
            sum += elem.doubleValue();
        }
        return sum;
    }
}