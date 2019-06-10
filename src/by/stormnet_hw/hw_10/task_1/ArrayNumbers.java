package by.stormnet_hw.hw_10.task_1;

// название класса все же так себе. ArrayMath, ArrayUtils что-то такое
public class ArrayNumbers {
    // лучше используй не Arr, a T/E - так очевиднее, то это generic
    public static <Arr extends Number> double sum(Arr[] array) {
        double sum = 0;
        for (Arr elem : array) {
            sum += elem.doubleValue();
        }
        return sum;
    }
}
