package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector vector = new Vector();
        vector.citire();
        System.out.println("Elementele(nesortate ale) vectorului introdus sunt: ");
        vector.afisare();
        vector.sortarePare();
        vector.sortareImpare();
        System.out.println("\n");
        System.out.println("Se sorteaza in ordine crescatoare elementele de pe pozitiile pare,\n"+
                          "folosind algoritmul shellsort, si elementele de pe pozitiile impare\n" +
                          "in ordine descrescatoare folosind algorimul heapsort. ");
        vector.vectorSortat();
    }
}
