package tests.test_24_05.task_1;

public class Program {
    public static void main(String[] args) {
        //Можно было и по-красивее названия кнопкам придумать :)
        //Ведь у каждой кнопки свое назначение :)
        Button button1 = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Изменить пин-код.");
            }
        });

        Button button2 = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Показать баланс.");
            }
        });

        button1.click();
        button2.click();
    }
}
