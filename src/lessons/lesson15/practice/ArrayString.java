package lessons.lesson15.practice;

// +
public class ArrayString {
    public static void main(String[] args) {
        String string = new String("Green, red, blue, yellow");

        String[] array = string.split(", ");
        for (String elem : array) {
            System.out.println(elem);
        }
    }
}
