package com.company;

import java.util.Scanner;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder("");

        result.append(text.charAt(0));
        for (int i = 0; i < text.length(); i++){
            char symb = text.charAt(i);
            if(result.charAt(result.length() - 1) != symb){
                result.append(symb);
            }
        }

        System.out.println(result);
    }
}
