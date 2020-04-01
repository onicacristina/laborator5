package com.company;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.currentTimeMillis;

public class Array {
    int a []= new int[100];
    int copy [] = new int[100];
    int i,n;

    public void generateRandom()
    {
        System.out.println("Introduceti numarul de elemente ale vectorului: ");
        System.out.print("n= ");
        Scanner scanner= new Scanner(System.in);
        n = scanner.nextInt();

        Random rand = new Random();
        for (int i = 0; i <n ; i++)
        {
            a[i]=rand.nextInt(100);
            copy[i]=a[i];
        }
    }

    public void viewArray()
    {
        System.out.println("Elementele tabloului sunt: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i] +"  ");
        }
        System.out.println();
    }
    public void backToInitialArray()
    {
        for (int i = 0; i <n ; i++) {
            a[i]=copy[i];
        }
    }

    public void shellSort() throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);
        int aux;
        for (int i = n/2; i >0 ; i=i/2) {
            for (int j = i; j <n ; j++) {
                for (int k = j-i ; k >=0 ; k=k-i) {
                    if(a[k+1]>=a[k])
                        break;
                    else
                    {
                        aux=a[k];
                        a[k]=a[k+1];
                        a[k+1]=aux;
                    }
                }
            }
        }
        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }

    public void heapSort() throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }

        for (int i=n-1; i>=0; i--)
        {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, i, 0);
        }
        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }

    void heapify(int a[], int n, int i)
    {

        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && a[l] > a[largest])
            largest = l;

        if (r < n && a[r] > a[largest])
            largest = r;

        if (largest != i)
        {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;

            heapify(a, n, largest);
        }
    }

    void sort(int s,int d)
    {
        int x,w;
        int i=s;
        int j=d;
        x=a[(i+j)/2];
        do
        {
            while (a[i]<x) i=i+1;
            while (x<a[j]) j=j-1;
            if (i<=j)
            {
                w=a[i];
                a[i]=a[j];
                a[j]=w;
                i=i+1;
                j=j-1;
            }
        } while (i<=j);
        if (s<j)
            sort(s,j);
        if (i<d)
            sort(i,d);
    }
    void quicksort() throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);

        sort(0,n-1);

        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }

}
