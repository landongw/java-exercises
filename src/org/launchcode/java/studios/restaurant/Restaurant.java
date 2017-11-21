package org.launchcode.java.studios.restaurant;

public class Restaurant {

    public static void main(String[] args) {

        // Create new menu
        Menu newMenu = new Menu("Scottish Arms", "All Day");

        // Create menu item
        MenuItem newItem = new MenuItem("Burger", 14.99, "Ground sirloin on artisan bun");
        MenuItem newItem1 = new MenuItem("Chicken Sammich", 12.99, "Yummy chicken on Kaiser roll");
        MenuItem newItem2 = new MenuItem("Chicken", 1.99, "Just chicken.");


        // Add items to menu
        newMenu.addItem(newItem);
        newMenu.addItem(newItem1);
        newMenu.addItem(newItem2);

        // Print menu
        System.out.println(newMenu);

        // Rename menu
//        newMenu.setRestaurantName("McDonalds");
//        System.out.println(newMenu);

        // Is item new?


    }
}
