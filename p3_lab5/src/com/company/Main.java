package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Abonat abonat= new Abonat();
        abonat.citire();
        System.out.println("Abonatii sunt: ");
        abonat.afisare();
        System.out.println("Abonatii sortati in ordine descrescatoare dupa valoare facturii sunt: ");
        abonat.quickSort();
        abonat.afisare();
        abonat.facturiMari();
    }
}
