/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sushi;

import java.util.Scanner;

/**
 * @author aleksandrakorolczuk1
 */
public class Order {

    public static void main(String[] args) {


        while (true) {
            // this loop will allow us to take unlimited orders from customers.
            Scanner scan = new Scanner(System.in);

            System.out.println("\n============================================\n" +
                    "Welcome to sushi bar!\n" +
                    "============================================\n" +
                    "[ORDER PART]\nPress enter to Start.");
            String key_word = new String("Close the day");
            String input = scan.nextLine();

            if (key_word.matches(input)) {
                System.out.println("Closed.");
                return;

            } else {
                Basic b1 = new Basic("Name of the customer: Daniel",/*order number */ 2254);
                b1.Delivery(b1.calculate_special(b1.calculate_price()));
                Kitchen k1 = new Kitchen();

                if (k1.ifKitchen()) {
                    Kitchen k2 = new Kitchen();
                    k2.unlockKitchen();
                }
            }
        }
    }
}

        
    

