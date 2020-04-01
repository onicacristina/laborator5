package com.company;

import java.util.Scanner;

public class Vector {
    int [] v = new int[50];
    int [] a =new int[50];
    int [] b = new int[50];
    int p=0,q=0;
    int n;

    public void citire()
    {
        System.out.println("Introduceti numarul de elemente ale vectorului: ");
        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Introduceti elementele vectorului: ");
        for (int i = 0; i <n ; i++) {
            System.out.print("v[" + i+ "]=");
            v[i]= scanner.nextInt();
            if(i%2==0)
            {
                a[p]=v[i];
                p++;
            }
            else
            {
                b[q]=v[i];
                q++;
            }
        }
    }

   public void afisare()
   {
       for (int i = 0; i <n ; i++) {
           System.out.print(v[i]+"  ");

       }
   }

    public void shellSort(int a[],int n)
    {
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
    }
    public void sortarePare()
    {
        shellSort(a,p);
    }

    public void heapSort(int a[],int n)
    {
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
    }

    void heapify(int a[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && a[l] < a[largest])
            largest = l;

        if (r < n && a[r] < a[largest])
            largest = r;

        if (largest != i)
        {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;
            heapify(a, n, largest);
        }
    }

    public void sortareImpare()
    {
        heapSort(b,q);
    }

    public void vectorSortat()
    {
        int p=0,q=0;
        for (int i = 0; i <n ; i++) {
            if (i % 2 == 0) {
                v[i] = a[p];
                p++;
            } else {
                v[i] = b[q];
                q++;
            }
        }
        System.out.println();
        System.out.println("Vectorul astfel sortat este: ");
        afisare();
    }

}
