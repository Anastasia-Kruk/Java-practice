package Test_26_04;

import java.util.Arrays;

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
