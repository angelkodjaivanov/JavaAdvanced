package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();

        String line = scanner.nextLine();
        while(!"PARTY".equals(line)){
            set.add(line);
            line = scanner.nextLine();
        }

        while(!"END".equals(line)){
            set.remove(line);
            line = scanner.nextLine();
        }

        System.out.println(set.size());
        for (String guest:set) {
            System.out.println(guest);
        }

    }
}
