package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MagicExcWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Character> characterMap = new HashMap<>();
        String f_word = scanner.next();
        String s_word = scanner.next();

        boolean isMagic = true;
        for (int i = 0; i < Math.min(f_word.length(), s_word.length()); i++) {
                if(characterMap.containsKey(f_word.charAt(i))){
                    char symb = characterMap.get(f_word.charAt(i));
                    if(s_word.charAt(i) != symb){
                        isMagic = false;
                        break;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    if(characterMap.containsValue(s_word.charAt(i))){
                        isMagic = false;
                        break;
                    }
                    characterMap.put(f_word.charAt(i), s_word.charAt(i));
                }
        }
        if(f_word.length() > s_word.length()){
            String otherPart = f_word.substring(s_word.length());
            for (int i = 0; i < otherPart.length(); i++) {
                if(!characterMap.containsKey(otherPart.charAt(i))){
                    isMagic = false;
                    break;
                }
            }
        }
        else if(f_word.length() < s_word.length()){
            String otherPart = s_word.substring(f_word.length());
            for (int i = 0; i < otherPart.length(); i++) {
                if(!characterMap.containsValue(otherPart.charAt(i))){
                    isMagic = false;
                    break;
                }
            }
        }

        if(isMagic){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
