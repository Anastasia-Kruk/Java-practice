package by.stormnet_hw.hw_10.task_2;

public class Book extends Publishing implements Cloneable {
    private String authur;

    public Book(String name, int year, String authur) {
        super(name, year);
        this.authur = authur;
    }

    public String getAuthur() {
        return authur;
    }

    public void setAuthur(String authur) {
        this.authur = authur;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authur='" + authur + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
