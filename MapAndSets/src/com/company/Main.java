package com.company;

import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        String line = scanner.nextLine();

        while(!line.equals("END")){
            String[] props = line.split(", ");

            if(props[0].equals("IN")){
                set.add(props[1]);
            }
            else if(props[0].equals("OUT")){
                set.remove(props[1]);
            }

            line = scanner.nextLine();
        }


        if(set.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        else {
            for (String car : set) {
                System.out.println(car);
            }
        }
    }
}
