package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = bf.readLine();
        int lines = 0;
        while(!"Collect".equals(line)){
            sb.append(line);
            lines++;
            line = bf.readLine();
        }
        int crates = 0;
        for (int i = 0; i < sb.length(); i++) {
            boolean hasClosed = true;
            if(hasClosed) {
                if (sb.charAt(i) == '[') {
                    crates++;
                    hasClosed = false;
                }
            }
            else{
                if(sb.charAt(i) == ']'){
                    hasClosed = true;
                }
            }
        }
        int n = crates / lines;

        int supplyCrates = 0;
        int foodAmount = 0;
        int drinkAmount = 0;

        Pattern foodPattern = Pattern.compile("\\[\\#([0-9]+)([a-zA-Z0-9 ]*)\\#([0-9]+)\\]");
        Pattern drinkPatter = Pattern.compile("\\[\\#([a-z]+)([a-zA-Z0-9 ]*)\\#([a-z]+)\\]");
        Matcher foodMatcher = foodPattern.matcher(sb.toString());
        Matcher drinkMatcher = drinkPatter.matcher(sb.toString());

        while (foodMatcher.find()){
            String openTag = foodMatcher.group(1);
            String body = foodMatcher.group(2);
            String closeTag = foodMatcher.group(3);
            if(openTag.equals(closeTag)){
                if(openTag.length() == n){
                    supplyCrates++;
                    int sum = 0;
                    HashSet<Character> characters = new HashSet<>();
                    for (int i = 0; i < body.length(); i++) {
                        if(!characters.contains(body.charAt(i))) {
                            sum += body.charAt(i);
                            characters.add(body.charAt(i));
                        }
                    }
                    foodAmount += sum * n;
                }
            }
        }

        while (drinkMatcher.find()){
            String openTag = drinkMatcher.group(1);
            String body = drinkMatcher.group(2);
            String closeTag = drinkMatcher.group(3);
            if(openTag.equals(closeTag)){
                if(openTag.length() == n){
                    supplyCrates++;
                    int sum = 0;
                    for (int i = 0; i < body.length(); i++) {
                        sum += body.charAt(i);
                    }
                    int tagSum = 0;
                    for (int i = 0; i < openTag.length(); i++) {
                        tagSum += openTag.charAt(i);
                    }
                    drinkAmount += sum * tagSum;
                }
            }
        }

        if(supplyCrates > 0) {
            System.out.println("Number of supply crates: " + supplyCrates);
            System.out.println("Amount of food collected: " + foodAmount);
            System.out.println("Amount of drinks collected: " + drinkAmount);
        }
        else{
            System.out.println("No supplies found!");
        }
    }
}
