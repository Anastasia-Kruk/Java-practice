package by.stormnet_hw.hw_6.animal;

public class Cat extends Animal {
    private String mustacheSize;
    private String color;
    private String eyesColor;

    public Cat(String mustacheSize, String color, String eyesColor, String name, int age, String pedigree) {
        super(name, age, pedigree);
        this.mustacheSize = mustacheSize;
        this.color = color;
        this.eyesColor = eyesColor;
    }

    public void printInfo() {
        System.out.println("Cat: \n\t" +
                "mustacheSize - " + mustacheSize + "\n" + "\t" +
                "color - " + color + "\n" + "\t" +
                "eyesColor - " + eyesColor + "\n" + "\t" +
                "name - " + name + "\n" + "\t" +
                "age - " + age + "\n" + "\t" +
                "pedigree -" + pedigree);
        System.out.println();
    }

    public String getMustacheSize() {
        return mustacheSize;
    }

    public void setMustacheSize(String mustacheSize) {
        this.mustacheSize = mustacheSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
