package com.company;

import java.util.Scanner;
public class ExtractABitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int position = scanner.nextInt();

        int mask = number >> position;
        System.out.println(mask & 1);
    }
}
