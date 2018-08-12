package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        String line = scanner.nextLine();
        while(!"search".equals(line)){
            String[] props = line.split("-");
            map.put(props[0], props[1]);
            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while(!"stop".equals(line)){
            if(map.containsKey(line)){
                System.out.println(line + " -> " + map.get(line));
            }
            else{
                System.out.println("Contact " + line + " does not exist.");
            }
            line = scanner.nextLine();
        }
    }
}
