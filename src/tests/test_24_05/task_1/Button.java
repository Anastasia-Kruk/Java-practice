package tests.test_24_05.task_1;

public class Button {
    private EventHandler eventHandler;

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void click() {
        eventHandler.execute();
    }

    //В данном случае геттер нам не нужен.
    //Объект типа EventHandler используется лишь для выполнения действий.
    //Никакой информации через него и о нем мы получать не будем.
    public EventHandler getEventHandler() {
        return eventHandler;
    }
}
