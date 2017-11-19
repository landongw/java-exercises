package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Menu {

    private long creationDate;
    private ArrayList<MenuItem> items;

    // Constructor
    public Menu(ArrayList<MenuItem> items, long creationDate) {
        this.items = items;
        this.creationDate = System.currentTimeMillis();
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
}
