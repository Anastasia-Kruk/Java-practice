package by.stormnet_hw.hw_6.animal;

public class MyClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Short", "White", "Green", "Murka", 1, "British");
        cat1.printInfo();

        Dog dog1 = new Dog("long", 60, "Din", 8, "Alaskan Malamute" );
        dog1.printInfo();

        Horse horse1 = new Horse(1.5, true, "Lucky", 3, "Mustang");
        horse1.printInfo();
    }
}
