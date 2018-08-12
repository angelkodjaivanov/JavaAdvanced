package com.company;

import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String start = "<upcase>";
        String end = "</upcase>";

        while (text.contains(start)){
            int startIndex = text.indexOf(start.charAt(start.length() - 1));
            int endIndex = text.indexOf(end);
            String get = text.substring(startIndex, endIndex);
            String upText = get.toUpperCase();
            text = text.replaceFirst(get, upText);
            text = text.replaceFirst(start, "");
            text = text.replaceFirst(end, "");
        }

        System.out.println(text);
    }
}
