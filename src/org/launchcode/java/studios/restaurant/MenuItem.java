package org.launchcode.java.studios.restaurant;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private long creationDate;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.creationDate = System.currentTimeMillis();
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    // TODO: isItemNew method


    // Example of generating equals and hashCode methods using getters and setters
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (Double.compare(menuItem.getPrice(), getPrice()) != 0) return false;
        if (getCreationDate() != menuItem.getCreationDate()) return false;
        if (getDescription() != null ? !getDescription().equals(menuItem.getDescription()) : menuItem.getDescription() != null)
            return false;
        return getCategory().equals(menuItem.getCategory());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPrice());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + getCategory().hashCode();
        result = 31 * result + (int) (getCreationDate() ^ (getCreationDate() >>> 32));
        return result;
    }
}
