package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("<.*?>");
        String text = scanner.nextLine();
        while (!text.equals("END")) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find())
                System.out.println(matcher.group());
            text = scanner.nextLine();
        }
    }
}
