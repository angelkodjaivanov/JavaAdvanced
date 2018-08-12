package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a)).boxed()
                .collect(Collectors.toList());
        int index = 0;
        if(arr.size() % 2 == 0){
            while (index < arr.size()) {
                int num_1 = arr.get(index);
                int num_2 = arr.get(index + 1);
                if(num_1 % 2 == 0 && num_2 % 2 == 0){
                    System.out.printf("%d, %d -> both are even%n", num_1, num_2);
                }
                else if(num_1 % 2 == 1 && num_2 % 2 == 1){
                    System.out.printf("%d, %d -> both are odd%n", num_1, num_2);
                }
                else{
                    System.out.printf("%d, %d -> different%n", num_1, num_2);
                }
                index+=2;
            }
        }
        else{
            System.out.println("invalid length");
        }
    }
}
