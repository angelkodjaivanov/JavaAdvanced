package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rangeParameters = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(number -> Integer.parseInt(number)).toArray();
        int start = rangeParameters[0];
        int end = rangeParameters[1];
        String command = scanner.nextLine();

        switch (command){
            case "even":
                operation(start, end, number -> number % 2 == 0).forEach(number -> System.out.print(number + " "));
                break;
            case "odd":
                operation(start, end, number -> number % 2 == 1 || number % 2 == -1).forEach(number -> System.out.print(number + " "));
                break;
        }
    }

    public static List<Integer> operation(int start, int end, Predicate<Integer> predicate){
        List<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(predicate.test(i)){
                numbers.add(i);
            }
        }
        return numbers;
    }
}
