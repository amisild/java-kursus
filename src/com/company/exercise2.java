//ülesanne 2 - palgatõus
package com.company;

import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        int[] palgad = {947, 1963, 2000, 850, 650, 1000, 708};

        for (int i = 0; i < palgad.length; i++) {
            if (palgad[i] < 1000) {
                System.out.println("Sinu uueks palgaks on " + palgad[i] * 1.05 + " eurot!");
            }
        }

        Scanner scan = new Scanner (System.in);
        System.out.println("Mis on su palk?");
        int palk = scan.nextInt();

        if (palk < 1000) {
            double raise = palk * 1.05;
            System.out.println("Sinu uueks palgaks on " + raise + " eurot!");
        } else {
            System.out.println("Sina palgatõusu ei saa!");
        }
    }
}