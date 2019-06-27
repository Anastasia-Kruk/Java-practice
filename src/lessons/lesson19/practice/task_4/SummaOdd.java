package lessons.lesson19.practice.task_4;

public class SummaOdd {
    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        ArraySumOdd arraySumOdd = (int[] num) -> {
            int sum = 0;
            int sumEven = 0;
            for (int i = 0; i < num.length; i++) {
                sum += i;
                if (i % 2 == 0) {
                    sumEven += i;
                }
            }
            return sum - sumEven;
        };
        System.out.println("Сумма нечётных чисел = " + arraySumOdd.sumOdd(numbers));
    }
}
