package by.stormnet.hw_5.task_3;

import java.util.Arrays;
import java.util.Random;

public class RecursArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt((10 - 1) + 1) + 1;
        }
        System.out.println(Arrays.toString(numbers));

        int num = 0;
        recursion(numbers, num);
    }

    static void recursion(int[] arr, int i) {
        if (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
            recursion(arr, i);
        }
    }
}
