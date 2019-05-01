package by.stormnet.hw_5.task_3;

import java.util.Arrays;
import java.util.Random;

public class RecursArray {
    public static void main(String[] args) {
        // не array, а numbers
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((10 - 1) + 1) + 1;
        }
        System.out.println(Arrays.toString(array));

        int num = 0;
        recursion(array, num);
// не нужен здесь абзац
    }

    static void recursion(int[] arr, int i) {
// не нужен здесь абзац
        if (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i++;

            recursion(arr, i);
// не нужен здесь абзац
        }
    }
    // 9, 3, 6, 9, 8, 2, 8, 7, 9, 3, - это вывод твоей программы, где-то лишняя запятая
}
