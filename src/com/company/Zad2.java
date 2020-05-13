package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //%
        // 10%3 =1
        // 11%3 =2
        // 12%3 = 0
        System.out.println("Podaj liczbę ");
        int myNumber = input.nextInt();

        if (myNumber %3 == 0) {
            System.out.println("Liczba podzielna przez 3");
        }
        else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }

    }
}
