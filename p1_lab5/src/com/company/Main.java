package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{
	// write your code here
        Menu menu = new Menu();
        menu.printMenu();

        Array array= new Array();
        char op;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Alegeti o optiune: ");
            op= scanner.next().charAt(0);
            op = Character.toUpperCase(op);

            switch(op){
                case 'C' : array.generateRandom(); break;
                case 'V' : array.viewArray(); break;
                case 'R' : array.backToInitialArray(); break;
                case 'S' : array.shellSort(); break;
                case 'H' : array.heapSort(); break;
                case 'Q' :  array.quicksort(); break;
                case 'X' : System.out.println("Ati ales sa iesiti din program!"); break;
                default: System.out.println("OPTIUNE ERONATA......reincearca!");
            }

        }while(op!='x' && op!='X');

    }
}
