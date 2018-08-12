package com.company;

import java.util.Scanner;
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", Integer.toHexString(firstNumber).toUpperCase(),
                String.format("%10s", Integer.toBinaryString(firstNumber)).replace(" ", "0"),
                secondNumber, thirdNumber);
    }
}
