package by.stormnet.hw_4.task_2;

import java.util.Arrays;
import java.util.Random;

public class TwoArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        Random random = new Random();

        int min = 0;
        int max = 5;

        double sum1 = 0;
        double mean1;

        double sum2 = 0;
        double mean2;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt((max - min) + 1) + min;
            sum1 += array1[i];

            array2[i] = random.nextInt((max - min) + 1) + min;
            sum2 += array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        mean1 = sum1 / array1.length;
        mean2 = sum2 / array2.length;

        if (mean1 > mean2)
            System.out.println("mean1 > mean2");

        else if (mean2 > mean1)
            System.out.println("mean2 > mean1 ");

        else
            System.out.println("mean1 = mean2");
    }
}
