//ülesanne 1 - kujundid
package com.company;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta ringi raadius: ");
        int r = scanner.nextInt(); //määrab ringi raadiuse
        int a = 2 * r; //määrab ruudu külje pikkuse

        int ruudu_pindala = a * a;
        int ruudu_umbermoot = 2 * a;
        double ringi_pindala = Math.PI * r * r;
        double ringi_umbermoot = 2 * Math.PI * r;

        System.out.println("Ruudu pindala on " + ruudu_pindala + " ja ümbermõõt " + ruudu_umbermoot + ".");
        System.out.println("Ringi pindala on " + ringi_pindala + " ja ümbermõõt " + ringi_umbermoot + ".");
    }
}
