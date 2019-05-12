package by.stormnet_hw.hw_7.task_1;

public class CarDemo {
    public static void main(String[] args) {
        Engine engine = new Engine(1.5, "disel");
        Transmission transmission = new Transmission("Manual", 5);
        Car reno = new Car("Scenic", "Black", engine, transmission);

        System.out.println(reno.toString());

//        reno.startMoving();

        reno.move();
    }
}
