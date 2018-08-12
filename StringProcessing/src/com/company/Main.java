package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArgs = scanner.nextLine().split(" - ");
        String name = inputArgs[0];
        String[] results = inputArgs[1].split(", ");
        double javaAdv = Double.parseDouble(results[0]);
        double javaOOP = Double.parseDouble(results[1]);
        double advOOP = Double.parseDouble(results[2]);

        double average = (javaAdv + javaOOP + advOOP) / 3;

        System.out.println(String.format("%-10s|%7s|%7s|%7s|%7s|",
                "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));

        System.out.println(String.format("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|",
                name, javaAdv, javaOOP, advOOP, average));

    }
}
