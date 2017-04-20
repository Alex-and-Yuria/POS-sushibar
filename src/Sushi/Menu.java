/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sushi;

/**
 *
 * @author aleksandrakorolczuk1
 */
public abstract class Menu implements Sushi { /// abstract class, we cant create objects from abstract class.

    String name; // basic data we use in our program: name of the
    int order;

    @Override // we override method with basic concept of how it works
    public double calculate_price() {
        double sum_total;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        sum_total = sum1 + sum2 + sum3;
        return sum_total;

    }

    public Menu(String n, int o) {
        n = name; // constructor 
        o = order;
    }

    public String getName() { //getters, setters
        return name;
    }

    public double getOrder() {
        return order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
