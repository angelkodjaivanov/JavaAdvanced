package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");
        List<String> list = new ArrayList<>();
        String text = scanner.nextLine();
        while (!text.equals("END")) {
            Matcher matcher = pattern.matcher(text);
            if (matcher.find())
                list.add("valid");
            else
                list.add("invalid");
            text = scanner.nextLine();
        }

        if (list.contains("valid")){
            for (String s:list) {
                System.out.println(s);
            }
        }
    }
}
