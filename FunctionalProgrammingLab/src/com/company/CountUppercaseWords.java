package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsInText = scanner.nextLine().split(" ");
        List<String> wordsStartingWithUppercase = new ArrayList<>();
        Predicate<String> predicate = word -> word.charAt(0) == word.toUpperCase().charAt(0);
        for (String word:wordsInText) {
            if(predicate.test(word)){
                wordsStartingWithUppercase.add(word);
            }
        }

        System.out.println(wordsStartingWithUppercase.size());
        for (String word:wordsStartingWithUppercase) {
            System.out.println(word);
        }
    }
}
