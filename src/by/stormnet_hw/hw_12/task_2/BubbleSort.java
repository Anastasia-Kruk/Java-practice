package by.stormnet_hw.hw_12.task_2;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Random random = new Random();
        int min = 0;
        int max = 14;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt((max - min) - 1) + min;
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 1; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
