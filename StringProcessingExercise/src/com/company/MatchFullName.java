package com.company;

import java.util.Scanner;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while(!"end".equals(line)){

            if(line.matches("^[A-Z]{1}[a-z]+\\ [A-Z]{1}[a-z]+$")){
                System.out.println(line);
            }

            line = scanner.nextLine();
        }
    }
}
