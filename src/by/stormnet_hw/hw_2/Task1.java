package by.stormnet_hw.hw_2;

import java.math.BigInteger;

public class Task1 {
    public static void main(String[] args){
        Integer number = 948;

        //Двоичная система
        String convert = Integer.toBinaryString(number);
        System.out.println("948 in Binar = " + convert);

        // Восьмеричная система
        convert = Integer.toOctalString(number);
        System.out.println("948 in Octal = " + convert);

        //Шестнадцатеричная система
        convert = Integer.toHexString(number).toUpperCase();
        System.out.println("948 in Hex = " + convert);

        System.out.println();

        Integer number1 = 763;

        //Двоичная система
        String convert1 = Integer.toBinaryString(number1);
        System.out.println(number1 + " in Binar = " + convert1);

        // Восьмеричная система
        convert1 = Integer.toOctalString(number1);
        System.out.println(number1 + " in Octal = " + convert1);

        //Шестнадцатеричная система
        convert1 = Integer.toHexString(number1).toUpperCase();
        System.out.println(number1 + " in Hex = " + convert1);

        System.out.println();






        BigInteger N = new BigInteger(new BigInteger("948").toString(2));
        BigInteger N1 = new BigInteger(new BigInteger("948").toString(8));

        System.out.println("948 = " + N + ";" + N1 + ";" );
        System.out.println();



        Double Num = 994.125;
        Integer number2 = 994;

        //Двоичная система
        String convert2 = Integer.toBinaryString(number2);
        System.out.println("994 in Binar = " + convert2);

        // Восьмеричная система
        convert2 = Integer.toOctalString(number2);
        System.out.println("994 in Octal = " + convert2);

        //Шестнадцатеричная система
        convert2 = Integer.toHexString(number2).toUpperCase();
        System.out.println("994 in Hex = " + convert2);

        System.out.println();



        Double Num1 = 523.25;
        Integer number3 = 523;

        //Двоичная система
        String convert3 = Integer.toBinaryString(number3);
        System.out.println("523 in Binar = " + convert3);

        // Восьмеричная система
        convert3 = Integer.toOctalString(number3);
        System.out.println("523 in Octal = " + convert3);

        //Шестнадцатеричная система
        convert3 = Integer.toHexString(number3).toUpperCase();
        System.out.println("523 in Hex = " + convert3);

        System.out.println();



        Double Num2 = 203.82;
        Integer number4 = 203;

        //Двоичная система
        String convert4 = Integer.toBinaryString(number4);
        System.out.println("203 in Binar = " + convert4);

        // Восьмеричная система
        convert4 = Integer.toOctalString(number4);
        System.out.println("203 in Octal = " + convert4);

        //Шестнадцатеричная система
        convert4 = Integer.toHexString(number4).toUpperCase();
        System.out.println("203 in Hex = " + convert4);
    }
}
