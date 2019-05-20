package by.stormnet_hw.hw_8.task_1;

import java.util.Scanner;

public class DesignOption extends House {
    private String designType;

    public DesignOption() {
    }

    public DesignOption(int numberOfFloor, int numberOfRooms, String designType) {
        super(numberOfFloor, numberOfRooms);
        this.designType = designType;
    }

    @Override
    public String toString() {
        if (isGarage() & isFence()) {
            return "Design of your house: " + designType + "\n" +
                    "Number of floors is: " + getNumberOfFloor() + "\n" +
                    "Number of rooms is: " + getNumberOfRooms() + "\n" +
                    "Garage: " + isGarage() + "\n" +
                    "Fence: " + isFence();

        } else if (isGarage()) {
            return "Design of your house: " + designType + "\n" +
                    "Number of floors is: " + getNumberOfFloor() + "\n" +
                    "Number of rooms is: " + getNumberOfRooms() + "\n" +
                    "Garage: " + isGarage();
        } else if (isFence()) {
            return "Design of your house: " + designType + "\n" +
                    "Number of floors is: " + getNumberOfFloor() + "\n" +
                    "Number of rooms is: " + getNumberOfRooms() + "\n" +
                    "Fence: " + isFence();
        } else {
            return "Design of your house: " + designType + "\n" +
                    "Number of floors is: " + getNumberOfFloor() + "\n" +
                    "Number of rooms is: " + getNumberOfRooms();
        }
    }

    // эти методы не должны быть в этом классе. Это все в мейн. 
    public void selectYourHouse() {
        optionDesign();
        selectNumberOfFloors();
        selectNumberOfRoomes();
        selectGarage();
        selectFence();
    }

    // эти методы не должны быть в этом классе. Это все в мейн. 
    public void optionDesign() {
        System.out.println("Please, select a house design:");
        System.out.println("1. Modern house");
        System.out.println("2. Chalet house");

        boolean program = true;
        int choice = 0;

        while (program) {
            Scanner sc = new Scanner(System.in);

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    setDesignType("Modern house");
                    program = false;
                    break;
                case 2:
                    setDesignType("Chalet house");
                    program = false;
                    break;
                default:
                    System.out.println("Please select from design option!");
                    break;
            }
        }
    }

    public String getDesignType() {
        return designType;
    }

    public void setDesignType(String designType) {
        this.designType = designType;
    }
}




