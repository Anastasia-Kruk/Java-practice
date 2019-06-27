package lessons.lesson19.practice.task_2;

public class NumberMain {
    private static double num = 25;

    public static void main(String[] args) {
        NumberSquare numberSquare = (x) -> Math.sqrt(x);
        double result = numberSquare.SquareOfNumber(num);
        System.out.println(result);
    }
}
