package com.company;
import java.util.*;
import java.util.Scanner;

public class Abonat {
     String name;
     String address;
    public long phoneNumber;
    public float invoiceValue;
    int i,n;
    Abonat a[] = new Abonat[100];

    public void citire()
    {
       // System.out.println("Introduceti numarul de abonati: ");

        Scanner scanner = new Scanner(System.in);

        //n= scanner.nextInt();
        do {
            System.out.println("Introduceti numarul de abonati (>=3) : ");
            n = scanner.nextInt();

        }while (n<3);
        scanner.nextLine();

        for (int i = 0; i <n ; i++) {
            a[i] = new Abonat();

            System.out.println("Introduceti datele abonatului "+(i+1)+" :");
            System.out.print("Numele: ");
            a[i].name =scanner.next();
            scanner.nextLine();
            //((Abonat)a[i]).name = scanner.next();
            System.out.print("Adresa: ");
            a[i].address = scanner.next();
            scanner.nextLine();
            System.out.print("Numarul de telefon: ");
            a[i].phoneNumber = scanner.nextLong();
            System.out.print("Valoarea facturii: ");
            a[i].invoiceValue = scanner.nextFloat();
            System.out.println();
        }
        scanner.close();
    }

    public void afisare()
    {
        System.out.println("---------------");
        for (int i = 0; i <n ; i++) {
            System.out.println("Nume: "+ a[i].name);
            System.out.println("Adresa: "+a[i].address);
            System.out.println("Nr.telefon: "+ a[i].phoneNumber);
            System.out.println("Valoarea facturii: "+ a[i].invoiceValue);
            System.out.println();

        }
    }

    public void sortare(int s,int d)
    {
        int i,j;
        Abonat x,w;
        i=s;
        j=d;
        x=a[(i+j)/2];
        do
        {
            while (a[i].invoiceValue> x.invoiceValue) i=i+1;
            while (x.invoiceValue>a[j].invoiceValue) j=j-1;
            if (i<=j)
            {
                w=a[i];
                a[i]=a[j];
                a[j]=w;
                i=i+1;
                j=j-1;
            }
        } while (i<=j);
        if (s<j) sortare(s,j);
        if (i<d) sortare(i,d);
    }
    void quickSort()
    {
        sortare(0,n-1);
    }
    public void facturiMari()
    {
        System.out.println();
        System.out.println("Primii 3 abonati cu cele mai mari facturi sunt: ");
        quickSort();
        System.out.println("------------");
        for (int i = 0; i <3 ; i++) {
            System.out.println("Nume: "+ a[i].name);
            System.out.println("Adresa: "+a[i].address);
            System.out.println("Nr.telefon: "+ a[i].phoneNumber);
            System.out.println("Valoarea facturii: "+ a[i].invoiceValue);
            System.out.println();
        }
    }

}
