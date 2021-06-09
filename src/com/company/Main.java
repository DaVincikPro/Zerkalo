package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner IntScanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to inf");
        int n = IntScanner.nextInt();

        for (int i = 1; i != n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
