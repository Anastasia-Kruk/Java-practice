package test_26_04;

import java.util.Random;
//Создай двумерный массив из 5 строк и случайного количества столбцов для большей наглядности. 2 строки - это не серьезно :)
public class RwArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        Random rand = new Random();

        int min = 1;
        int max = 8;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[rand.nextInt((max - min) + 1) + min];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt((max - min) + 1) + min;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
