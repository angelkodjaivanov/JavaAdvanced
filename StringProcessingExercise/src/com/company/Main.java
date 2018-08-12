package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String searchText = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(i + searchText.length() <= text.length()) {
                String partOfText = text.substring(i, i + searchText.length());
                if (partOfText.toLowerCase().equals(searchText.toLowerCase())) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
