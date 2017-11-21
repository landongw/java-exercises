package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Menu {

    private long creationDate;

    // TODO: redo as HashMap of MenuItem
    private ArrayList<MenuItem> items;
    // TODO: updatedDate variable

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

    // TODO: public boolean addItem(itemName) method
    // returns true when item is added

    // TODO: public boolean removeItem(itemName) method
    // returns true when item is removed

    // TODO: public boolean setUpdatedDate(menuName) method
    // returns true when updated

    // TODO: public Date getUpdatedDate(menuName) method

    // TODO: public void printMenu(menuName) method
    // prints but does not return

    // TODO: public void printMenuItem(itemName) method
    // prints but does not return




}
