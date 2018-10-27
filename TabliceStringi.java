package com.company;

public class TabliceStringi {
    public static void main(String[] args){
        String[] tablica = {"Monika", "Ola", "Ala"};
        int sum = 0;
        for (int i = 0; i<tablica.length; i++){
            System.out.println(tablica[i].toLowerCase());
            System.out.println(tablica[i].length());
            sum += tablica[i].length();

        }
        System.out.println(sum);
    }
}
