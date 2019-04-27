package test_26_04;

import java.util.Arrays;

public class ArrayInteger {
    public static void main(String[] args) {

        int[] arrayInt = new int[10];


        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}
