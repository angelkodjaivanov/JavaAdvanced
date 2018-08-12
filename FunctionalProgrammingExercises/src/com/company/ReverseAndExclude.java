package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(number -> Integer.parseInt(number)).toArray();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            if(numbers[i] % num != 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
