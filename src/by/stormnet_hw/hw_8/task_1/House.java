package by.stormnet_hw.hw_8.task_1;

import java.util.Scanner;

// класс абстрактный - это хорошо
public abstract class House {
    // эти переменные стоит сделать protected. Тогда они будут доступны у наследников
    private int numberOfFloor;
    private int numberOfRooms;
    private boolean isGarage;
    private boolean isFence;

    public House() {
    }

    public House(int numberOfFloor, int numberOfRooms) {
        this.numberOfFloor = numberOfFloor;
        this.numberOfRooms = numberOfRooms;
    }

    public House(int numberOfFloor, int numberOfRooms, boolean isGarage, boolean isFence) {
        this(numberOfFloor, numberOfRooms);
        this.isGarage = isGarage;
        this.isFence = isFence;
    }

   
    @Override
    public String toString() {
        return "House{" +
                "numberOfFloor=" + numberOfFloor +
                ", numberOfRooms=" + numberOfRooms +
                ", isGarage=" + isGarage +
                ", isFence=" + isFence +
                '}';
    }

    // эти методы не должны быть в этом классе. Это все в мейн. 
    // почему ты ограничиваешь пользователя в кол-ве этажей? пускай сколько хочет, столько и будет. Метод должен быть более универсальным
    public void selectNumberOfFloors() {
        System.out.println("Please select number of floors in your house:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        boolean program = true;
        int numberOfFloor = 0;

        while (program) {
            Scanner sc = new Scanner(System.in);

            try {
                numberOfFloor = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (numberOfFloor) {
                case 1:
                    setNumberOfFloor(1);
                    program = false;
                    break;
                case 2:
                    setNumberOfFloor(2);
                    program = false;
                    break;
                case 3:
                    setNumberOfFloor(3);
                    program = false;
                    break;
                default:
                    System.out.println("Maximum you can select 3 floors.");
                    break;
            }
        }
    }

    // эти методы не должны быть в этом классе. Это все в мейн. 
    // почему ты ограничиваешь пользователя в кол-ве комнат? пускай сколько хочет, столько и будет. Метод должен быть более универсальным
    public void selectNumberOfRoomes() {
        System.out.println("Please select number of rooms in your house:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        boolean program = true;
        int numberOfFloor = 0;

        while (program) {
            Scanner sc = new Scanner(System.in);

            try {
                numberOfFloor = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (numberOfFloor) {
                case 1:
                    setNumberOfRooms(1);
                    program = false;
                    break;
                case 2:
                    setNumberOfRooms(2);
                    program = false;
                    break;
                case 3:
                    setNumberOfRooms(3);
                    program = false;
                    break;
                case 4:
                    setNumberOfRooms(4);
                    program = false;
                    break;
                case 5:
                    setNumberOfRooms(5);
                    program = false;
                    break;
                default:
                    System.out.println("Maximum you can select 5 rooms.");
                    break;
            }
        }
    }

    // эти методы не должны быть в этом классе. Это все в мейн. 
    public void selectGarage() {
        System.out.println("Do you want to have a garage?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");

        boolean program = true;
        int garage = 0;

        while (program) {
            Scanner sc = new Scanner(System.in);

            try {
                garage = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (garage) {
                case 1:
                    isGarage = true;
                    program = false;
                    break;
                case 2:
                    isGarage = false;
                    program = false;
                    break;

                default:
                    System.out.println("Please select one of option!");
                    break;
            }
        }
    }

    // эти методы не должны быть в этом классе. Это все в мейн. 
    public void selectFence() {
        System.out.println("Do you want to have a fence?");
        System.out.println("1 - Yes.");
        System.out.println("2 - No.");


        boolean program = true;
        int fence = 0;

        while (program) {
            Scanner sc = new Scanner(System.in);

            try {
                fence = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (fence) {
                case 1:
                    isFence = true;
                    program = false;
                    break;
                case 2:
                    isFence = false;
                    program = false;
                    break;

                default:
                    System.out.println("Please select one of option!");
                    break;
            }
        }
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isGarage() {
        return isGarage;
    }

    public void setGarage(boolean garage) {
        isGarage = garage;
    }

    public boolean isFence() {
        return isFence;
    }

    public void setFence(boolean fence) {
        isFence = fence;
    }
}
