package by.stormnet.hw_5.task_1;

import java.util.Random;
import java.util.Scanner;

public class Prediction {
    public static void main(String[] args) {
        String ask;


        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your question: ");
            ask = sc.nextLine();

            if (ask.charAt(ask.length() - 1) != '?') {
                System.out.println("It's not a question");
            }

        } while (ask.charAt(ask.length() - 1) != '?');
        answer();
    }

    static void answer() {

        Random random = new Random();
        int ans = random.nextInt((2 - 1) + 1) + 1;

        switch (ans) {
            case (1):
                System.out.println("Yes");
                break;
            case (2):
                System.out.println("No");
                break;
        }
    }


}
