package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaje liczbe ");

	    Scanner scanner = new Scanner(System.in);

	    int number = scanner.nextInt();

	    if (number>5) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
            // number <=5
        }

    }
}
