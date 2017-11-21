package org.launchcode.java.studios.restaurant;

public class MenuItem {

    private final int itemId;
    private int nextId = 0;
    private String itemName;
    private double price;
    private String description;
    private long creationDate;
    private long updatedDate;

    public MenuItem(String itemName, double price, String description) {
        this.itemId = getNextId();
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.creationDate = System.currentTimeMillis();
        this.updatedDate = System.currentTimeMillis();
    }

    public int getItemId() {
        return itemId;
    }

    public int getNextId() {
        nextId++;
        return nextId;
    }

    public String getItemName() {

        return itemName;
    }

    public void setItemName(String itemName) {

        this.itemName = itemName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreationDate() {
        return creationDate;
    }

// TODO: don't need this, remove when done
//    public void setCreationDate(long creationDate) {
//        this.creationDate = System.currentTimeMillis();
//    }

    public long getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(long updatedDate) {
        this.updatedDate = System.currentTimeMillis();
    }

    public boolean isItemNew() {
        if (System.currentTimeMillis() - creationDate < 5.184e+9) {
            return true;
        }
        return false;
    }

    // Generated equals and hashCode methods using getters and setters
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (itemId != menuItem.itemId) return false;
        if (Double.compare(menuItem.price, price) != 0) return false;
        if (creationDate != menuItem.creationDate) return false;
        if (updatedDate != menuItem.updatedDate) return false;
        return description != null ? description.equals(menuItem.description) : menuItem.description == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = itemId;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) (creationDate ^ (creationDate >>> 32));
        result = 31 * result + (int) (updatedDate ^ (updatedDate >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemId=" + itemId +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
