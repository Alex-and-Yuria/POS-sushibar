/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sushi;

import java.text.DecimalFormat;

import java.util.Scanner;

/**
 *
 * @author aleksandrakorolczuk1
 */
public class Basic extends Menu { // subclass from menu with basic calculate methods.

    public static int[] q = new int[10]; // string with quantity from the order

    public static String[] n = new String[10];  // string that stores names of sushi meals.

    public Basic(String name, int order) { // constructor just with 
        //data that we use in Menu class, we dont add anything.
        super(name, order);

    }

    DecimalFormat df = new DecimalFormat("####0.00");

    @Override // we override method from our interface
    public double calculate_price() {
        double total = 0; // total price of the order 
        double tax = 0; // GST tax
        Scanner in = new Scanner(System.in);
        double[] p = {2.25, 2.50, 3.25, 2.25, 4.25, 2.99, 7.99, 1.99, 5.79, 6.19};
        String[] data = {"California Roll", "Kappa Maki", "Tekka Maki", "Tamago", "Salmon Nigiri", "Avocado Roll", "Tempura", "Gyoza", "Toro Sashimi", "Dynamite Roll"};
        int[] quantity = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = data[i];
            q[i] = quantity[i];
        }

        for (int i = 0; i < q.length; i++) {
            System.out.println("How many " + n[i] + "s would you like to order?");
            q[i] = in.nextInt();
        }

        for (int i = 0; i < q.length; i++) {
            // System.out.println("The quantity of " + n[i] + ": "+ q[i]);
            total += q[i] * p[i];
            tax = total * 0.05;

        }

        System.out.println("\n[RECEIPT & TAX] \nGST: " + df.format(tax) + " \nYour total price is: " + df.format(total));
        return total;

    }

    public double calculate_special(double total_special) { // method to calculate if the customer is qualified for a free gift
        if (total_special >= 100.0) {
            System.out.println("\n[FREE GIFT]\nThank you for shopping. You got 1 extra tempura for free!");
        } else {
            System.out.println("Thank you for shopping with us!");
        }
        return total_special;
    }

    public double Delivery(double total) {  // method to calculate the distance and possible delivery charge if we choose delivery option
        Scanner delivery = new Scanner(System.in);

        System.out.println("\n[DELIVERY OPTION]\nIf this is delivery, press 1.");
        int input = delivery.nextInt();

        if (input == 1) {
            System.out.println("What's the distance to the restaurant?");
            double distance = delivery.nextDouble();
            double charge = 0;
            if (distance <= 4.5) {
                System.out.println("Delivery is free");
            } else if (distance > 4.5 && distance <= 6) {
                System.out.println("Delivery charge is +$5");
                charge = total + 5;
            } else if (distance > 6 && distance <= 10) {
                System.out.println("Delivery charge is +$10");
                charge = total + 10;
            } else {
                System.out.println("I'm sorry, we don\'t deliver more than 10 km.");
            }
        } else {
            System.out.println("\n[PAYING CASH & CALCULATE CHANGE]\nHow would you like to pay? If cash, press 1.");  // method to calculate the change if customer pays cash
            int answer = delivery.nextInt();
            if (answer == 1) {
                System.out.println("What is the amount of cash?");
                double bill = delivery.nextDouble();
                double change = 0;
                change = bill - total;
                System.out.println("Your change is: " + df.format(change));
            } else {
                System.out.println("Please pay with card terminal.");
            }
        }
        return total;

    }

}
