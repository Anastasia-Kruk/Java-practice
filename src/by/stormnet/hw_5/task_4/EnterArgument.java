package by.stormnet.hw_5.task_4;

public class EnterArgument {
    public static void main(String[] args) {
        String temp = "Hi, my name is %s. I’m %d years old and I was born in %d. I’m the true ruler of %s!!!";
        String name = "Rose";
        int age = 99;
        int year = 1856;
        String kingdom = "Lichtenstein";

        template(temp, name, age, year, kingdom);
    }

    static void template(String temp, String name, int age, int year, String kingdom) {
        System.out.printf(temp, name, age, year, kingdom);
    }
}
