package com.company;

import java.util.Scanner;
public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        int maxResult = Integer.MIN_VALUE;
        String resultName = "";
        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            int score = Integer.parseInt(scanner.nextLine());

            for(int j = 0; j < name.length(); j++){
                if(name.charAt(j) % 2 == 0){
                    score += name.charAt(j);
                }
                else{
                    score -= name.charAt(j);
                }
            }

            if(score > maxResult){
                maxResult = score;
                resultName = name;
            }

        }

        System.out.printf("The winner is %s - %d points", resultName, maxResult);

    }
}

