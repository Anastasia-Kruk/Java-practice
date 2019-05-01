package by.stormnet.hw_5.task_4;

public class EnterArgument {
    // все же метод main() должен быть первым. технически это не ошибка, но он главнее
    static void template(String name, int age, int year, String kingdom) {
        /* задание выполнялось до лекции про классы, поэтому это просто чтобы ты обратила внимание
        
        у тебя переменная temp - это шаблон, которым возможно будут пользоваться другие методы класса 
        + скорее всего еще и константа, значит, такие штуки надо делать полем (т.е. переменной для всего класса)
        
        опять же, я помню когда это ДЗ было, но теперь надо будет делать именно полями класса такие переменные
        */
        String temp = "Hi, my name is %s. I’m %d years old and I was born in %d. I’m the true ruler of %s!!!";
        System.out.printf(temp, name, age, year, kingdom);
    }

    public static void main(String[] args) {
        String name = "Rose";
        int age = 99;
        int year = 1856;
        String kingdom = "Lichtenstein";

        template(name, age, year, kingdom);
    }
}
