package by.stormnet_hw.hw_7.task_1;

public class Transmission {
    private String typeOfTransmission;
    private int numberOfGears;
    // minGear думаю лучше будет. Или defaultGear
    private int gear = 0;

    public Transmission(String typeOfTransmission, int numberOfGears){
        this.typeOfTransmission = typeOfTransmission;
        this.numberOfGears = numberOfGears;
    }

    public void shiftGearUp() {
        if (gear < numberOfGears) {
            gear++;
            System.out.println("Number of gear is: " + gear);
            // ты уже сделала gear++, сеттер просто дублирует уже выполненное действие в данном случае
            setGear(gear);
        } else {
            System.out.println("Number of gear is maximum!" + gear);
        }
    }

    public void shiftGearDown(){
        if (gear == 0){
            System.out.println("Number of gear is minimum");
        } else {
            gear--;
            System.out.println("Number of gear is: " + gear);
            
            // ты уже сделала gear--, сеттер просто дублирует уже выполненное действие в данном случае
            setGear(gear);
        }
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    // по идее ты уже задала тип трансмиссии для данного авто при создании экземпляра класса (через new)
    // в уже готовой машине можно конечно сменить все что угодно, но не будет ошибкой убрать эту возможность
    // просто чтобы ты имела ввиду, что необязательно всегда делать сеттер
    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
