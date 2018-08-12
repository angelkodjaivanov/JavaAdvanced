package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(a -> Integer.parseInt(a))
                .boxed().collect(Collectors.toList());

        numbers.removeIf(a ->  a % 2 == 1);
        for (int i = 0; i < numbers.size(); i++) {
            if(i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + ", ");
            }
            else{
                System.out.println(numbers.get(i));
            }
        }
        numbers.sort((a, b) -> a.compareTo(b));
        for (int i = 0; i < numbers.size(); i++) {
            if(i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + ", ");
            }
            else{
                System.out.println(numbers.get(i));
            }
        }
    }
}
