package com.lab_cycles.co4.q16;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n;
        String str;
        HashSet<String> set1= new HashSet<String>();
        System.out.println("HashSet 1");
        System.out.println("Enter No. of countries:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the name of countries:");
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<n;i++) {
            str=sc1.nextLine();
            set1.add(str);
        }

        System.out.println("HashSet 2");
        HashSet<String> set2= new HashSet<String>();
        System.out.println("Enter No. of countries:");
        n=sc.nextInt();
        System.out.println("Enter the name of countries:");

        for(int i=0;i<n;i++) {
            str=sc1.nextLine();
            set2.add(str);
        }
        System.out.println("Set1:"+set1);
        System.out.println("Set2:"+set2);

        HashSet<String> a= new HashSet<String>(set1);
        a.addAll(set2);
        System.out.println("Union of country set:"+a);

        HashSet<String> b= new HashSet<String>(set1);
        b.retainAll(set2);
        System.out.println("Intersection of country set:"+b);

        HashSet<String> c= new HashSet<String>(set1);
        c.removeAll(set2);
        System.out.println("Difference of country set:"+c);

    }

}