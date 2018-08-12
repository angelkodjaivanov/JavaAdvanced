package com.company;

import java.util.Scanner;

public class ReplaceTag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String line = scanner.nextLine();
        while (!"END".equals(line)){
            sb.append(line).append("\n");
            line = scanner.nextLine();
        }

        System.out.println(sb.toString());
    }
}
