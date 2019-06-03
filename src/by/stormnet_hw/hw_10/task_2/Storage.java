package by.stormnet_hw.hw_10.task_2;

import java.util.ArrayList;

public class Storage implements Cloneable {
    // модификатор доступа, думаю что точно не default должен быть. 
    ArrayList<Publishing> librery; // <- library

    public Storage() {
    }

    public Storage(ArrayList<Publishing> librery) {
        this.librery = librery;
    }

    public ArrayList<Publishing> getStorege() {
        return librery;
    }

    public void setStorege(ArrayList<Publishing> librery) {
        this.librery = librery;
    }

    @Override
    protected Storage clone() throws CloneNotSupportedException {
        return (Storage) super.clone();
    }
}
