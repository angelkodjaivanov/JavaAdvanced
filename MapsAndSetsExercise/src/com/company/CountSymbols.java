package com.company;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();
        String text = scanner.nextLine();
        for(int i = 0; i < text.length(); i++){
            if(map.containsKey(text.charAt(i))){
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
            else{
                map.put(text.charAt(i), 1);
            }
        }

        for (char symbol:map.keySet()) {
            System.out.println(symbol + ": " + map.get(symbol) + " time/s" );
        }
    }
}
