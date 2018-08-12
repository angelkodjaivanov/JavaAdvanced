package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountSameValuesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArgs = scanner.nextLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String number:inputArgs) {
            if(map.containsKey(number)){
                map.put(number, map.get(number) + 1);
            }
            else{
                map.put(number, 1);
            }
        }

        for (String key:map.keySet()) {
            System.out.println(key + " - " + map.get(key) + " times");
        }
    }
}
