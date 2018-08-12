package com.company;


import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> usersAndIPs = new TreeMap<>();
        TreeMap<String, Integer> usersDuration = new TreeMap<>();

        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] inputArgs = scanner.nextLine().split(" ");
            String ip = inputArgs[0];
            String user = inputArgs[1];
            int duration = Integer.parseInt(inputArgs[2]);

            if(usersAndIPs.containsKey(user)){
                TreeSet<String> ips = usersAndIPs.get(user);
                ips.add(ip);
                usersAndIPs.put(user, ips);
                usersDuration.put(user, usersDuration.get(user) + duration);
            }
            else{
                TreeSet<String> ips = new TreeSet<>();
                ips.add(ip);
                usersAndIPs.put(user, ips);
                usersDuration.put(user, duration);
            }

        }

        for (String user:usersAndIPs.keySet()) {
            System.out.println(user + ": " + usersDuration.get(user) +
                    " [" + String.join(", ", usersAndIPs.get(user)) + "]");
        }
    }
}
