package com.company;

import java.util.*;

public class SetOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> numbers_1 = new LinkedHashSet<>();
        Set<Integer> numbers_2 = new LinkedHashSet<>();

        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            numbers_1.add(number);
        }
        for(int i = 0; i < m; i++){
            int number = Integer.parseInt(scanner.nextLine());
            numbers_2.add(number);
        }

        for (Integer number_1:numbers_1) {
            for (Integer number_2:numbers_2) {
                if(number_1 == number_2){
                    System.out.print(number_1 + " ");
                }
            }
        }

    }
}
