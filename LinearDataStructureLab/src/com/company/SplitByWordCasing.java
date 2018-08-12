package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SplitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] wordsAfterSplit = text.split("[.!,/()'\\\\\";:\\[\\] ]");
        List<String> lowerCase = lowerCaseWords(wordsAfterSplit);
        List<String> mixedCase = mixedCaseWords(wordsAfterSplit);
        List<String> upperCase = upperCaseWords(wordsAfterSplit);

        lowerCase.removeIf(item -> item == null || "".equals(item));
        mixedCase.removeIf(item -> item == null || "".equals(item));
        upperCase.removeIf(item -> item == null || "".equals(item));

        System.out.println("Lower-case: " + String.join(", ", lowerCase));
        System.out.println("Mixed-case: " + String.join(", ", mixedCase));
        System.out.println("Upper-case: " + String.join(", ", upperCase));
    }

    private static List<String> upperCaseWords(String[] wordsAfterSplit) {
        List<String> upperCase = new ArrayList<>();
        for(int i = 0; i < wordsAfterSplit.length; i++){
            boolean isUpper = true;
            String word = wordsAfterSplit[i];
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) < 'A' || word.charAt(j) > 'Z'){
                    isUpper = false;
                }
            }
            if(isUpper){
                upperCase.add(word);
            }
        }
        return upperCase;
    }

    private static List<String> mixedCaseWords(String[] wordsAfterSplit) {
        List<String> mixedCase = new ArrayList<>();
        for(int i = 0; i < wordsAfterSplit.length; i++) {
            String word = wordsAfterSplit[i];
            if(!(lowerCaseWords(wordsAfterSplit).contains(word) || upperCaseWords(wordsAfterSplit).contains(word))){
                mixedCase.add(word);
            }
        }
        return mixedCase;
    }

    private static List<String> lowerCaseWords(String[] wordsAfterSplit) {
        List<String> lowerCase = new ArrayList<>();
        for(int i = 0; i < wordsAfterSplit.length; i++){
            boolean isLower = true;
            String word = wordsAfterSplit[i];
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) < 'a' || word.charAt(j) > 'z'){
                    isLower = false;
                }
            }
            if(isLower){
                lowerCase.add(word);
            }
        }
        return lowerCase;
    }
}
