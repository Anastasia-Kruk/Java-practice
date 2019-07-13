package by.stormnet.hw_3.task_3;

public class Phrase {
    public static void main(String[] args) {
        String ask = "Whara is my dog+";
        String str = ask.replace('a', 'e').replace('+', '?');

        System.out.println(str);
    }
}