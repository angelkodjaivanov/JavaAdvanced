package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> numbersFirstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(a -> Integer.parseInt(a)).boxed().collect((Collectors.toCollection(LinkedHashSet::new)));
        LinkedHashSet<Integer> numbersSecondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(a -> Integer.parseInt(a)).boxed().collect((Collectors.toCollection(LinkedHashSet::new)));

        int round = 1;
        while(round != 50){
            int firstNumber = numbersFirstPlayer.iterator().next();
            numbersFirstPlayer.remove(firstNumber);
            int secondNumber = numbersSecondPlayer.iterator().next();
            numbersSecondPlayer.remove(secondNumber);

            if(firstNumber > secondNumber){
                numbersFirstPlayer.add(firstNumber);
                numbersFirstPlayer.add(secondNumber);
            }
            else if(secondNumber > firstNumber){
                numbersSecondPlayer.add(firstNumber);
                numbersSecondPlayer.add(secondNumber);
            }

            if(numbersFirstPlayer.isEmpty()){
                break;
            }
            if(numbersSecondPlayer.isEmpty()){
                break;
            }

            round++;
        }

        if(numbersFirstPlayer.size() > numbersSecondPlayer.size()){
            System.out.println("First player win!");
        }
        else if(numbersSecondPlayer.size() > numbersFirstPlayer.size()){
            System.out.println("Second player win!");
        }
        else{
            System.out.println("Draw!");
        }
    }
}
