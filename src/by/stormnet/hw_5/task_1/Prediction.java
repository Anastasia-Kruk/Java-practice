package by.stormnet.hw_5.task_1;

import java.util.Random;
import java.util.Scanner;

public class Prediction {
    public static void main(String[] args) {
        // где используешь переменную, там ее и создаешь
        String ask;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your question: ");
//            String ask = sc.nextLine();
            ask = sc.nextLine();

            if (ask.charAt(ask.length() - 1) != '?') {
                System.out.println("It's not a question");
            }

            // (ask.charAt(ask.length() - 1) != '?')
           //эта строка дублируется, значит уже есть проблема в коде.

            /*
           как насчет сделать так:

            while(true) {
            if(ask.charAt(ask.length() - 1) == '?') {
                 answer();
                 // return остановит выполнение метода main, а, значит и всей программы
                 return;
                }
            }
            */
        } while (ask.charAt(ask.length() - 1) != '?');
        answer();
    }

    // этот метод по заданию должен принимать строку и проверять на знак "?" и возвращать true/false, т.е. boolean
    static void answer() {

//         Random random = new Random();
//         random.nextBoolean() - используй его
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
