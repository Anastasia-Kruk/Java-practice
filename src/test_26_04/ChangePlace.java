package test_26_04;

import java.util.Arrays;

//В данном случае при перемене местами элементов массива первый элемент должен оказать на последнем месте, что получается
//через постоянную перемену двух элементов местами.
//Т.е. дано [0, 1, 2, 3, 4, 5, 6, 7], на выходе получаем: [1, 2, 3, 4, 5, 6, 7, 0].
//Поправь логику чуть-чуть
public class ChangePlace {
    public static void main(String[] args) {
        int[] arrayCh = new int[8];

        int temp = 0;

        for (int i = 0; i < arrayCh.length; i++) {
            arrayCh[i] = i;
        }
        System.out.println(Arrays.toString(arrayCh));

        for (int i = 1; i < arrayCh.length - 1; i++) {

            temp = arrayCh[i - 1];
            arrayCh[i - 1] = arrayCh[i + 1];
            arrayCh[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arrayCh));
    }
}
