package com.company;
import java.util.Scanner;

public class PetlaWhile {
    public static void main(String[] args) {
        System.out.println("Daj liczbe");
        Scanner scanner = new Scanner(System.in); // przyjmujemy od uzytkownika, dlatego in
        int liczba = scanner.nextInt(); // jak chcemy coś zrobic na scannerze to wpisujemy scanner.
        System.out.println("Daj 2 liczbe");
        Scanner scanner2 = new Scanner(System.in);
        int liczba2 = scanner.nextInt();
        if (liczba2 != 0) {
            System.out.println("Wynik z dzielenia to  " + liczba / liczba2);
        } else {
            System.out.println("Nie można dzielić przez 0!!!");
        }
    }
}