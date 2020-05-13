package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println("Podaj hasło");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
/*
== służy do porównaniu typów prostych
liczby, pojedyńcze znaki warunki logiczne
equals służy do porównania typów złożony z DUŻEJ litery
*/
// || - lub
        if (password.equals("Akademia") || password.equals("akademia")) {
            System.out.println("Podałeś poprawne hasło");
        } else {
            System.out.println("Nie podałeś poprawnego hasła");
        }

    }

}

