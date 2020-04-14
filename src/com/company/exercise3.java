//ülesanne 3 - temperatuur
package com.company;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta temperatuur (täisarvuna): ");
        int temp = Integer.valueOf(scanner.nextLine());   //muudab vastuse (string) numbriks (int)
        if (temp > 25) {
            System.out.println("Hot!");
        } else if (temp < 10) {
            System.out.println("Cold!");
        } else {
            System.out.println("Warm!");
        }
    }
}