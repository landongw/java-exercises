package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {

    private final int menuId;
    private static int nextId = 0;
    private String restaurantName;
    private String menuName;  // Breakfast, Lunch, Dinner, All Day, Brunch
    // TODO: redo as HashMap of MenuItem
    private HashMap<Integer, MenuItem> menuItems;
    private long creationDate;
    private long updatedDate;


    public Menu(String restaurantName, String menuName) {
        this.menuId = nextId++;
        this.restaurantName = restaurantName;
        this.menuName = menuName;
        this.creationDate = System.currentTimeMillis();
        this.menuItems = new HashMap<>();
        this.updatedDate = System.currentTimeMillis();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public HashMap<Integer, MenuItem> getMenuItems() {
        return menuItems;
    }


    // TODO: don't need this? remove when done
//    public void setMenuItems(HashMap<Integer, MenuItem> menuItems) {
//        this.menuItems = menuItems;
//    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(long updatedDate) {
        this.updatedDate = System.currentTimeMillis();
    }


    // TODO: public void addItem(itemName) method
    // returns true when item is added
    public void addItem(MenuItem o) {
        int i = o.getNextId();
        this.menuItems.put(i, o);
    }

    // TODO: public boolean removeItem(itemName) method
    // returns true when item is removed

    // TODO: public void printMenu(menuName) method
    // prints but does not return

    // TODO: public void printMenuItem(itemName) method
    // prints but does not return


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (menuId != menu.menuId) return false;
        if (creationDate != menu.creationDate) return false;
        if (updatedDate != menu.updatedDate) return false;
        if (!restaurantName.equals(menu.restaurantName)) return false;
        if (!menuName.equals(menu.menuName)) return false;
        return menuItems.equals(menu.menuItems);
    }

    @Override
    public int hashCode() {
        int result = menuId;
        result = 31 * result + restaurantName.hashCode();
        result = 31 * result + menuName.hashCode();
        result = 31 * result + menuItems.hashCode();
        result = 31 * result + (int) (creationDate ^ (creationDate >>> 32));
        result = 31 * result + (int) (updatedDate ^ (updatedDate >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Menu: " +
                "\nrestaurantName: " + restaurantName +
                "\nmenuName: " + menuName +
                "\nmenuItems: " + menuItems;
    }
}
