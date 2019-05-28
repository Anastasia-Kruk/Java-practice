package by.stormnet_hw.hw_10.task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Анекдоты", 1999, "народ");
        Book book2 = new Book("Сказки", 1988, "Русский народ");

        Magazine magazine1 = new Magazine("ELLE", 2010, 8);
        Magazine magazine2 = new Magazine("VOGUE", 2000, 5);

        ArrayList<Publishing> librery = new ArrayList<>();
        librery.add(book1);
        librery.add(book2);
        librery.add(magazine1);
        librery.add(magazine2);

        Storage storege = new Storage(librery);
        Storage storege2 = new Storage();

        try {
            storege2 = storege.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        for (Publishing p : storege.getStorege()) {
            System.out.println(p.toString());
        }
        System.out.println("\n Clone:");

        magazine1.setNumber(12);
        book2.setAuthur("Zero");

        for (Publishing p : storege2.getStorege()) {
            System.out.println(p.toString());
        }
    }
}

