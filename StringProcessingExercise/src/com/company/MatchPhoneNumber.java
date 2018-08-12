package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while(!"end".equals(line)){

            if(line.matches("^\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}$"))
                System.out.println(line);

            line = scanner.nextLine();
        }
    }
}
