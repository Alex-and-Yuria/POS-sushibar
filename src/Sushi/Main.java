package Sushi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double total = 0;

        while (true) {
            // this loop will allow us to take unlimited orders from customers.
            Scanner scan = new Scanner(System.in);

            System.out.println("\n============================================\n" +
                    "Welcome to sushi bar!\n" +
                    "============================================\n" +
                    "[ORDER PART]\nPress enter to Start.");
            String key_word = new String("Close the day");
            String input = scan.nextLine();

            if (!key_word.matches(input)) {
                Calc c1 = new Calc();
                c1.calcPrice(total);
                c1.special(total);
                c1.delivery(total);
                c1.payment(total);

                Kitchen k1 = new Kitchen();
                if (k1.ifKitchen()) {
                    Kitchen k2 = new Kitchen();
                    k2.unlockKitchen();
                }
            } else {
                System.out.println("Closed.");
                return;
            }
        }
    }
}

        
    

