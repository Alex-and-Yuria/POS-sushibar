package Sushi;

import java.lang.reflect.Array;

public class Sushi extends Food {

    // Set up Sushi information.
    public Sushi(String itemName, double itemPrice, int ingrAvocado, int ingrCrab, int ingrNori, int ingrRice, int ingrShrimp) {
        super(itemName, itemPrice);
        ingrAvocado = 0;
        ingrCrab = 0;
        ingrNori = 0;
        ingrRice = 0;
        ingrShrimp = 0;
    }
}
