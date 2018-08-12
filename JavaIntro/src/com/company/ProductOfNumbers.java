package com.company;

import java.math.BigInteger;
import java.util.Scanner;
public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();

        BigInteger result = new BigInteger("1");
        int number = startNum;
        do {
            result = result.multiply(BigInteger.valueOf(number));
            number++;
        }while (number <= endNum);
        System.out.println("product[" + startNum + ".." + endNum +"] = " + result);
    }
}
