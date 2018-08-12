package com.company;

import java.util.Scanner;

public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++){
            System.out.print( "\\u" + Integer.toHexString(line.charAt(i) | 0x10000).substring(1) );
        }
    }
}
