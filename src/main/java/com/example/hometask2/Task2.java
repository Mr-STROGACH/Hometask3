package com.example.hometask2;

import java.util.*;
class Task2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if ((a > b) && (a > c)){
            System.out.println (a);
        } else
        if ((b > a) && (b > c)){
            System.out.println (b);
        } else
        if ((c > a) && (c > b)){
            System.out.println (c);
        }
    }
}