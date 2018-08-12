package com.company;

import java.util.Scanner;
public class AverageOfThreeNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first_number = scanner.nextDouble();
        double second_number = scanner.nextDouble();
        double third_number = scanner.nextDouble();
        double average = (first_number + second_number + third_number) / 3;
        System.out.printf("%.2f", average);
    }
}
