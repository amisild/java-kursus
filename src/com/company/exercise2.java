//ülesanne 2 - palgatõus
package com.company;

public class exercise2 {

    public static void main(String[] args) {
        int[] palgad = {947, 1963, 2000, 850, 650, 1000, 708};

        for (int i = 0; i < palgad.length; i++) {
            if (palgad[i] < 1000) {
                System.out.println("Sinu uueks palgaks on " + palgad[i] * 1.05 + " eurot!");
            }
        }
    }
}