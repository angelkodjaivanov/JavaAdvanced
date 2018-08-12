package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("[ \\s\\,\\.\\!\\?]+");
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            if(words[i].equals(stringBuilder.reverse().toString())){
                palindromes.add(words[i]);
            }
        }

        palindromes = palindromes.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("[" + String.join(", ", palindromes) + "]");
    }
}
