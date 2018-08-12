package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Long> map = new HashMap<>();
        String material = scanner.nextLine();
        while(!("stop".equals(material))){
            long quantity = Long.parseLong(scanner.nextLine());
            if(map.containsKey(material)){
                map.put(material, map.get(material) + quantity);
            }
            else{
                map.put(material, quantity);
            }
            material = scanner.nextLine();
        }

        for (String key:map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
