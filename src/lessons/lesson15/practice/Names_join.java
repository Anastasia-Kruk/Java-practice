package lessons.lesson15.practice;

// имя класса
public class Names_join {
    public static void main(String[] args) {
        String name1 = "Anna";
        String name2 = "Bob";
        String name3 = "John";
        String name4 = "Lisa";

        String string = String.join(" ", name1, name2, name3, name4);
        System.out.println(string);
    }
}
