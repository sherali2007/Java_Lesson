package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1- : ");
        int a = sc.nextInt();
        System.out.print("2- : ");
        int b = sc.nextInt();
        System.out.print("3- : ");
        int c = sc.nextInt();
        int count = 0;

        if (a > 0) {
            count++;
        }

        if (b > 0) {
            count++;
        }

        if (c > 0) {
            count++;
        }

        System.out.println (count);

    }
}
