package Sushi;

public class Food {

    protected String name;
    protected double price;

    // Basic food information
    public Food(String itemName, double itemPrice) {
        name = itemName;
        price = itemPrice;
    }

    // Set food's name
    public void setName(String itemName) {
        name = itemName;
    }

    // Set food's price
    public void setNumber(double itemPrice) {
        price = itemPrice;
    }

    // Return food's name.
    public String getName() {
        return name;
    }

    // Return food's price.
    public double getPrice() {
        return price;
    }

    // Return description of food as string.
    public String toString() {
        return name + "\t" + price;
    }
}
