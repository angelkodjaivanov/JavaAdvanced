package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("([,_]{1})([a-zA-Z]+)([0-9]{1})");
        String line = bf.readLine();
        List<String> decodedStrings = new ArrayList<>();
        while(!"Ascend".equals(line)){
            for (int i = 0; i < decodedStrings.size(); i+= 2) {
                while (line.contains(decodedStrings.get(i))){
                    line = line.replaceFirst(decodedStrings.get(i), decodedStrings.get(i + 1));
                }
            }
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                String operator = matcher.group(1);
                String saveText = matcher.group(2);
                StringBuilder text = new StringBuilder(matcher.group(2));
                int digit = Integer.parseInt(matcher.group(3));
                decodedStrings.add(operator + saveText + digit);
                if(operator.equals(",")){
                    for (int i = 0; i < text.length(); i++) {
                        text.setCharAt(i, (char)(text.charAt(i) + digit));
                    }
                }
                else {
                    for (int i = 0; i < text.length(); i++) {
                        text.setCharAt(i, (char)(text.charAt(i) - digit));
                    }
                }
                decodedStrings.add(text.toString());
                line = line.replaceFirst(operator + saveText + digit, text.toString());
            }
            System.out.println(line);
            line = bf.readLine();
        }
    }
}
