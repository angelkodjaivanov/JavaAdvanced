package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> vehicles = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String line = scanner.nextLine();
        int sold = 0;
        while (!line.equals("End of customers!")){
            String[] props = line.split(" ");

            boolean isSold = false;
            for (int i = 0; i < vehicles.size(); i++){
                int seats = Integer.parseInt(vehicles.get(i).substring(1));
                if(vehicles.get(i).charAt(0) == props[0].toLowerCase().charAt(0) && seats == Integer.parseInt(props[2])){
                    System.out.printf("Yes, sold for %d$\n", vehicles.get(i).charAt(0) * seats);
                    vehicles.remove(i);
                    sold++;
                    isSold = true;
                    break;
                }
            }

            if(!isSold){
                System.out.println("No");
            }

            line = scanner.nextLine();
        }
        System.out.println("Vehicles left: " + String.join(", ", vehicles));
        System.out.println("Vehicles sold: " + sold);
    }
}
