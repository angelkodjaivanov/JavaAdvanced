package com.company;

import java.util.Scanner;

public class ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArgs = scanner.nextLine().split("://");
        if(inputArgs.length == 2){
            String protocol = inputArgs[0];
            String other = inputArgs[1];
            int divideUrl = other.indexOf("/");
            String server = other.substring(0, divideUrl);
            String resources = other.substring(divideUrl + 1, other.length());
            System.out.println("Protocol = " + protocol);
            System.out.println("Server = " + server);
            System.out.println("Resources = " + resources);
        }
        else{
            System.out.println("Invalid URL");
        }
    }
}
