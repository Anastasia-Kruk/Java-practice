package by.stormnet_hw.hw_7.task_1;

public class Engine {
    // не совсем понятно из названия переменной за что она отвечает. 
    private double volume;
    // лучше fuelType - тогда сразу понятно и нет желания исправить на int и думать про кол-во топлива
    private String fuel;
    // isRunning - так правильнее
    private boolean running;

    public Engine(double volume, String fuel) {
        this.volume = volume;
        this.fuel = fuel;
    }

    public void startEngine(boolean running) {
        // перед ! не нужен пробел
        if ( !running) {
            System.out.println("Start engine -Brrr...");
            setRunning(true);
        } else {
            System.out.println("Engine is already started");
        }
    }

    public boolean stopEngine() {
        if (running) {
            System.out.println("Stop engine!");
            return running = false;
        } else {
            System.out.println("Engine is already stopped");
            return running;
        }
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}

