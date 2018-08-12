package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            String[] arr = scanner.nextLine().split(" ");
            for (String el:arr) {
                set.add(el);
            }
        }


        for (String el:set) {
            System.out.print(el + " ");
        }
    }
}
