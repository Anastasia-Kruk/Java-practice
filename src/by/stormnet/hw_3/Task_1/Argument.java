package by.stormnet.hw_3.Task_1;

public class Argument {
    public static void main(String[] args) {
        // !!! имена пакетов с маленькой буквы, т.е. Task_1 -> task_1
        
        // ты назвала переменную argument, по идее это уже результат, аргумент закончился на стадии парсинга его из строки
        int argument = Integer.parseInt(args[0]) << 8;

        System.out.println(argument);
    }

}
