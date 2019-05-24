package by.stormnet_hw.hw_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the amount to convert.");
        Scanner sc = new Scanner(System.in);

        double inSum = 0;
        try {
            inSum = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Please select the currency: \n " +
                "\t1. USD \n" +
                "\t2. EUR");
        int choice = 0;
        Currency cur = Currency.USD;

        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (choice) {
            case 1:
                cur = Currency.USD;
                break;
            case 2:
                cur = Currency.EUR;
                break;
            default:
                System.out.println("Please select from the proposed currencies!");
                break;
        }
        UserConversion userConversion = new UserConversion(inSum, cur);
        userConversion.conversion();
    }
}
