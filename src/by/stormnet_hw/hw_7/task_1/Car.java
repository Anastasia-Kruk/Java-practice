package by.stormnet_hw.hw_7.task_1;

import java.util.Scanner;

public class Car {
    private String model;
    private String color;
    private Engine engine;
    private Transmission transmission;

    public Car(String model, String color, Engine engine, Transmission transmission) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine.getVolume() + " (" + engine.getFuel() + ")" +
                ", transmission=" + transmission.getTypeOfTransmission() + " (" + transmission.getNumberOfGears() + ")" +
                '}';
    }
    //    public void startMoving() {
//        engine.startEngine(engine.isRunning());
//        transmission.shiftGearUp();
//        showSpeed();
//    }

    public void showSpeed() {
        System.out.println("Speed is: " + transmission.getGear() * 20);
    }

    public void showMenu() {
        System.out.println("\n     *Menu*\n Select the next step: \n");
        System.out.println("1. Start engine");
        System.out.println("2. Shift gear UP");
        System.out.println("3. Shift gear DOWN");
        System.out.println("4. Select neutral gear");
        System.out.println("5. Stop engine");
    }

    public void move() {
        showMenu();

        boolean prog = true;
        int choice = 0;

        while (prog) {
            Scanner sc = new Scanner(System.in);

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    engine.startEngine(engine.isRunning());
                    break;
                case 2:
                    transmission.shiftGearUp();
                    showSpeed();
                    break;
                case 3:
                    transmission.shiftGearDown();
                    showSpeed();
                    break;
                case 4:
                    transmission.setGear(0);
                    System.out.println("Number of gear is neutral (0)");
                    showSpeed();
                    break;
                case 5:
                    if (transmission.getGear() == 0) {
                        engine.stopEngine();
                        prog = false;
                    } else {
                        System.out.println("To stop engine select neutral gear.");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
