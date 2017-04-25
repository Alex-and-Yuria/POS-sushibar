/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sushi;

import java.util.Scanner;

/**
 *
 * @author aleksandrakorolczuk1
 */
public class Kitchen {

    int key = 3344;
    Scanner input = new Scanner(System.in);

    public boolean ifKitchen() {
        System.out.println("\n\nIf you are kitchen staff and need access, press 1.");
        int k = input.nextInt();

        if (k != 1) {
            System.out.println("See you soon!");
            return false;

        }
        return true;
    }

    public void unlockKitchen() {
        System.out.println("please type your password");
        int password = input.nextInt();
        while (password != key) {

            System.out.println("Wrong password, try again.");
            Scanner input = new Scanner(System.in);

            System.out.println("Please type your password again.");
            password = input.nextInt();
        }
        if (password == key) {
            System.out.println("Password is correct.\n\n[Ingredients for Order]");

            int q_nori = 0;
            int q_avocado = 0;
            int q_fish = 0;
            int q_rice = 0;

            int[] nori = {2, 2, 3, 0, 4, 2, 1, 1, 3, 2};
            int[] avocado = {0, 2, 3, 1, 2, 8, 5, 1, 5, 6};
            int[] fish = {1, 2, 3, 0, 4, 2, 7, 1, 3, 6};
            int[] rice = {2, 7, 3, 0, 4, 2, 7, 6, 5, 0};

            for (int i = 0; i < 10; i++) {

                String n = Calc.n[i];
                int q = Calc.q[i];

                q_nori += nori[i] * Calc.q[i];
                q_avocado += avocado[i] * Calc.q[i];
                q_fish += fish[i] * Calc.q[i];
                q_rice += rice[i] * Calc.q[i];
            }
            System.out.println("nori: " + q_nori + "\navocado: " + q_avocado + "\nfish: " + q_fish + "\nrice: " + q_rice);
        }
    }
}
