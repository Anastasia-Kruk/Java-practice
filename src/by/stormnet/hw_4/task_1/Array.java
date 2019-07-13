package by.stormnet.hw_4.task_1;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[8];

        Random random = new Random();
        int min = 1;
        int max = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
