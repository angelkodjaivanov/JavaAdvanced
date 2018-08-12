package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(number -> Integer.parseInt(number)).toArray();
        String line = scanner.nextLine();
        while(!"end".equals(line)){
            switch (line){
                case "add":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = operation(numbers[i], number -> number = number + 1);
                    }
                    break;
                case "multiply":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = operation(numbers[i], number -> number = number * 2);
                    }
                    break;
                case "subtract":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = operation(numbers[i], number -> number = number - 1);
                    }
                    break;
                case "print":
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + " ");
                    }
                    System.out.println();
                    break;
            }
            line = scanner.nextLine();
        }
    }

    public static int operation(int number, Function<Integer, Integer> function){
        return function.apply(number);
    }
}
