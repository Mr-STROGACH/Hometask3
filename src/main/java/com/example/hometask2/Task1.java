package com.example.hometask2;

import java.util.*;
class Task1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if (a > b){
            System.out.println (a);
        } else {
            System.out.println (b);
        }
    }
}