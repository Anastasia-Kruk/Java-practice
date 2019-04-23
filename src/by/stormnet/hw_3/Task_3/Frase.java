package by.stormnet.hw_3.Task_3;

public class Frase {
    public static void main(String[] args) {
        String ask = "Whara is my dog+";
        // так себе имя для переменной + можно сделать в одну строку
        // ask.replace('a', 'e').replace('+', '?');
        String str = ask.replace('a', 'e');
        String fool = str.replace('+', '?');

        // fool переводится как "дурак" :) гугл переводчик полезная штука
        System.out.println(fool);
    }
}
