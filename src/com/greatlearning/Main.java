package com.greatlearning;

import com.greatlearningservice.Mergesort;
import com.greatlearningservice.NoteCount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  currency denominations:");
        int Size=sc.nextInt();
        int a[]=new int[Size];
        System.out.println("Enter the currency denominations value :");
        for (int k=0;k<Size;k++)
            a[k]=sc.nextInt();

        System.out.println("Enter the amount you want to pay");
        int amount=sc.nextInt();
         Mergesort ms=new Mergesort();
        ms.mergeSort(a,0,a.length-1);
        NoteCount nc =new NoteCount();
        nc.implementation(a,amount);


    }
}
