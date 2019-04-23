package by.stormnet.hw_3.Task_2;

import java.math.BigDecimal;

public class DoubleSum {
    public static void main(String[] args) {
        // все гуд, имя такета только если еще не исправила все 
        double numD1 = 1.2;
        double numD2 = 1.4;
        BigDecimal bigD1 = BigDecimal.valueOf(numD1);
        BigDecimal bigD2 = BigDecimal.valueOf(numD2);

        BigDecimal sum = bigD1.add(bigD2);

        System.out.println("Summa double = " + sum);
    }
}
