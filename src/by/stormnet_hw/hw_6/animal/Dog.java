package by.stormnet_hw.hw_6.animal;

public class Dog extends Animal {
    private String tailLength;
    private int size;


    public Dog(String tailLength, int size, String name, int age, String pedigree) {
        super(name, age, pedigree);
        this.tailLength = tailLength;
        this.size = size;
    }

    public void printInfo() {
        System.out.println("Dog: \n\t" +
                "tailLength - " + tailLength + "\n" + "\t" +
                "size - " + size + "\n" + "\t" +
                "name - " + name + "\n" + "\t" +
                "age - " + age + "\n" + "\t" +
                "pedigree -" + pedigree);
        System.out.println();
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}