package Test_26_04;

import java.util.Arrays;

public class ArrayBreak {
    public static void main(String[] args) {
        int[] arrayBr5 = new int[10];

        for (int i = 0; i < arrayBr5.length; i++) {
            arrayBr5[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayBr5));

        System.out.println("First five numbers:");

        for (int i = 0; i < arrayBr5.length; i++) {
            if (arrayBr5[i] < 6) {
            } else break;
            System.out.print(arrayBr5[i] + ", ");
        }
    }
}
