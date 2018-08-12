package com.company;

import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        if(input.length < 2){
            System.out.println("Count = " + input.length);
            System.out.println("Sum = " + input[0]);
        }
        else{
            Function<String, Integer> func = number -> Integer.parseInt(number);
            int sum = 0;
            for (int i = 0; i < input.length; i++) {
                sum += func.apply(input[i]);
            }
            System.out.println("Count = " + input.length);
            System.out.println("Sum = " + sum);
        }

    }
}
