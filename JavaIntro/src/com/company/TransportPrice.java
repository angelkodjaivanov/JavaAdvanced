package com.company;

import java.util.Scanner;
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        String partOfDay = scanner.next();

        if(distance < 20){
            if(partOfDay.equals("day")){
                System.out.printf("%.2f", 0.70 +  distance * 0.79);
            }
            else if(partOfDay.equals("night")){
                System.out.printf("%.2f", 0.70 + distance * 0.90);
            }
        }
        else if(distance >= 20 && distance < 100){
            System.out.printf("%.2f", distance * 0.09);
        }
        else if(distance >= 100){
            System.out.printf("%.2f", distance * 0.06);
        }

    }
}
