package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double firstSide = scanner.nextDouble();
	    double secondSide = scanner.nextDouble();
        System.out.printf("%.2f", firstSide * secondSide);
    }
}
