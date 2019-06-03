package by.stormnet_hw.hw_10.task_2;

abstract class Publishing {
    // ты наследовалась от этого класса, думаю хотела эти поля сделать доступными для наследников класса. 
    // protected - такой модификатор тебе нужен для таких случаев.
    String name;
    int year;

    public Publishing(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
