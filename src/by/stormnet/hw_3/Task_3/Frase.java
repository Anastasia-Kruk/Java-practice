package by.stormnet.hw_3.Task_3;

public class Frase {
    public static void main(String[] args) {
        String ask = "Whara is my dog+";
        String str = ask.replace('a', 'e');
        String fool = str.replace('+', '?');

        System.out.println(fool);
    }
}