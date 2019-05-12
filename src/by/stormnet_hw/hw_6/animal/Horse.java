package by.stormnet_hw.hw_6.animal;

public class Horse extends Animal {
    private double height;
    boolean wearsHorseShoe;

    public Horse(double height, boolean wearsHorseShoe, String name, int age, String pedigree) {
        super(name, age, pedigree);
        this.height = height;
        this.wearsHorseShoe = wearsHorseShoe;
    }

    public void printInfo() {
        System.out.println("Horse: \n\t" +
                "height - " + height + "\n" + "\t" +
                "wearsHorseShoe - " + wearsHorseShoe + "\n" + "\t" +
                "name - " + name + "\n" + "\t" +
                "age - " + age + "\n" + "\t" +
                "pedigree -" + pedigree);
        System.out.println();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getWearsHorseShoe() {
        return wearsHorseShoe;
    }

    public void setWearsHorseShoe(boolean wearsHorseShoe) {
        this.wearsHorseShoe = wearsHorseShoe;
    }
}
