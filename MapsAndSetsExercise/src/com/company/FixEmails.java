package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        String name = scanner.nextLine();
        while(!("stop".equals(name))){
            String email = scanner.nextLine();
            if(!(email.toLowerCase().endsWith(".us") || email.toLowerCase().endsWith(".uk")
                    || email.toLowerCase().endsWith(".com"))){
                map.put(name, email);
            }
            name = scanner.nextLine();
        }

        for (String key:map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
