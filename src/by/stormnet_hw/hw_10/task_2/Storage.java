package by.stormnet_hw.hw_10.task_2;

import java.util.ArrayList;

public class Storage implements Cloneable {
    ArrayList<Publishing> librery;

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
