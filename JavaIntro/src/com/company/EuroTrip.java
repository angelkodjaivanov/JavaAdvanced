package com.company;

import java.math.BigDecimal;
import java.util.Scanner;
public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wurst = scanner.nextDouble();
        BigDecimal convert = new BigDecimal("4210500000000");
        BigDecimal money = new BigDecimal(wurst * 1.20).multiply(convert);
        System.out.printf("%.2f marks", money);
    }
}
