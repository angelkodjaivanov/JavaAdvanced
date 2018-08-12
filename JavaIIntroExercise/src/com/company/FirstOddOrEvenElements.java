package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(a -> Integer.parseInt(a))
                .boxed().collect(Collectors.toList());
        String[] inputArgs = scanner.nextLine().split(" ");
        int count = Integer.parseInt(inputArgs[1]);
        int reminder = 0;

        if(inputArgs[2].equals("odd")){
            reminder = 1;
        }

        for(int i = 0; i < numbers.size(); i++){
            if(count == 0){
                break;
            }
            if(numbers.get(i) % 2 == reminder){
                System.out.print(numbers.get(i) + " ");
                count--;
            }
        }

    }
}
