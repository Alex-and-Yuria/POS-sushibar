package Test;

import java.util.Scanner;

public class PriceCalculator {

    public void PriceCalculator() {

        // identifier
        double subtotal = 0, total, tax;
        double taxRate = 0.05;

        // scanner
        Scanner in = new Scanner(System.in);

        // item name array
        String [] n = {"California Roll","Kappa Maki","Tekka Maki", "Tamago", "Salmon Nigiri", "Avocado Roll"};

        // price array
        double[] p = {2.25, 2.50, 3.25, 2.25, 2.25, 2.25};


        // make quantity array
        double[] q = new double[6];

        // ask quantities and store in array q
        for (int i = 0; i < q.length; i++) {
            System.out.println((i+1) + ". How many " + n[i] + "?");
            q[i] = in.nextInt();
        }

        System.out.println("--------------------");

        // output each item and caluclate subtotal
        for (int i = 0; i < q.length; i++) {
            System.out.println(n[i] + ": $" + q[i] * p[i]);
            subtotal += q[i] * p[i];
        }

        // calculate tax
        tax = taxRate * subtotal;

        // calculate total
        total = subtotal + tax;

        // output subtotal, tax and total
        System.out.println("--------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("GST(" + taxRate*100 + "%): $" + String.format("%.2f", tax));
        System.out.println("====================");
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
