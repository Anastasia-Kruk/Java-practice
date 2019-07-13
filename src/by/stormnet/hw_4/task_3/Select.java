package by.stormnet.hw_4.task_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Select {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter array size: ");
            size = sc.nextInt();
            if (size <= 3)
                System.out.println("It's not a valid number, please, try again!");
        } while (size <= 3);

        int[] array = new int[size];

        Random random = new Random();
        int min = 0;
        int max = size;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[counter];
        int e = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[e] = array[i];
                e++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
