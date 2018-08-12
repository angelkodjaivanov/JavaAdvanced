package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();
        String line = scanner.nextLine();
        while(!("end".equals(line))){
            String[] inputArgs = line.split(" ");
            String ip = inputArgs[0].split("=")[1];
            String user = inputArgs[2].split("=")[1];

            if(map.containsKey(user)) {
                LinkedHashMap<String, Integer> m = map.get(user);
                if(map.get(user).containsKey(ip)){
                    m.put(ip, m.get(ip) + 1);
                    map.put(user, m);
                }
                else{
                    m.put(ip, 1);
                    map.put(user, m);
                }
            }
            else{
                LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
                m.put(ip, 1);
                map.put(user, m);
            }

            line = scanner.nextLine();
        }

        for (String key:map.keySet()) {
            LinkedHashMap<String, Integer> m = map.get(key);
            System.out.println(key + ":");
            String text = "";
            for (String ip: m.keySet()) {
                text += ip + " => " + m.get(ip) + ", ";
            }
            String result = text.substring(0, text.length() - 2) + ".\n";
            System.out.print(result);
        }
    }
}
