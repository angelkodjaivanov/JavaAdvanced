package com.company;

import java.util.Scanner;
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();

        int result = 0;
        if(firstString.length() == secondString.length()){
            for(int i = 0; i < firstString.length(); i++){
                result += firstString.charAt(i) * secondString.charAt(i);
            }
        }
        else if(firstString.length() > secondString.length()){
            for(int i = 0; i < secondString.length(); i++){
                result += firstString.charAt(i) * secondString.charAt(i);
            }
            for(int index = secondString.length(); index < firstString.length(); index++){
                result += firstString.charAt(index);
            }
        }
        else{
            for(int i = 0; i < firstString.length(); i++){
                result += firstString.charAt(i) * secondString.charAt(i);
            }
            for(int index = firstString.length(); index < secondString.length(); index++){
                result += secondString.charAt(index);
            }
        }
        System.out.println(result);
    }
}
