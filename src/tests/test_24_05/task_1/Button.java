package tests.test_24_05.task_1;

public class Button {
    private EventHandler eventHandler;

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void click() {
        eventHandler.execute();
    }

    public EventHandler getEventHandler() {
        return eventHandler;
    }
}
