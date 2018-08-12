package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int number = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();

	    for(int i = 0; i < number; i++){
	        names.add(scanner.nextLine());
        }

        for (String name:names) {
            System.out.println(name);
        }

    }
}
