package by.stormnet_hw.hw_7.task_1;

public class CarDemo {
    public static void main(String[] args) {
//        diesel
        Engine engine = new Engine(1.5, "disel");
        Transmission transmission = new Transmission("Manual", 5);
        Car reno = new Car("Scenic", "Black", engine, transmission);

        System.out.println(reno.toString());

        // удаляй закомментированный код в конечной версии
//        reno.startMoving();

        reno.move();
    }
}
