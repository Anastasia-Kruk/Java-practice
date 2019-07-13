package by.stormnet_hw.hw_2;

public class Task5 {
    public static void main(String[] args) {
        int[] number = {3,5,6,9,10,11};

        for (int i =0; i <number.length; i++) {
            if (number [i] % 3 ==0) {
                System.out.println(number[i]);
            }
        }
    }
}
