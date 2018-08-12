package com.company;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String word:bannedWords) {
            while (text.contains(word)){
                int startIndex = text.indexOf(word);
                for (int i = startIndex; i < startIndex + word.length(); i++) {
                   text = text.substring(0, i) + "*" + text.substring(i + 1);
                }
            }
        }

        System.out.println(text);
    }
}
