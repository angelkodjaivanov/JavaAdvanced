package com.company;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, HashSet<String>> map = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while(!"JOKER".equals(line)){
            String[] inputArgs = line.split(": ");
            String player = inputArgs[0];
            String[] cards = inputArgs[1].split(", ");

            for (int i = 0; i < cards.length; i++) {
                if(map.containsKey(player)) {
                    HashSet<String> playerCards = map.get(player);
                    playerCards.add(cards[i]);
                    map.put(player, playerCards);
                }
                else{
                    HashSet<String> playerCards = new HashSet<>();
                    playerCards.add(cards[i]);
                    map.put(player, playerCards);
                }

            }

            line = scanner.nextLine();
        }

        for (String name:map.keySet()) {
            HashSet<String> playerCards = map.get(name);
            int result = countHand(playerCards);
            System.out.println(name + ": " + result);
        }
    }

    private static int countHand(HashSet<String> playerCards) {

        int result = 0;

        for (String card:playerCards) {
            String power = card.substring(0, card.length() - 1);
            String type = card.substring(card.length() - 1);

            switch (type){
                case "S":
                    switch (power){
                        case "2": result += 2 * 4; break;
                        case "3": result += 3 * 4; break;
                        case "4": result += 4 * 4; break;
                        case "5": result += 5 * 4; break;
                        case "6": result += 6 * 4; break;
                        case "7": result += 7 * 4; break;
                        case "8": result += 8 * 4; break;
                        case "9": result += 9 * 4; break;
                        case "10": result += 10 * 4; break;
                        case "J": result += 11 * 4; break;
                        case "Q": result += 12 * 4; break;
                        case "K": result += 13 * 4; break;
                        case "A": result += 14 * 4;break;
                    }
                    break;
                case "H":
                    switch (power){
                        case "2": result += 2 * 3; break;
                        case "3": result += 3 * 3; break;
                        case "4": result += 4 * 3; break;
                        case "5": result += 5 * 3; break;
                        case "6": result += 6 * 3; break;
                        case "7": result += 7 * 3; break;
                        case "8": result += 8 * 3; break;
                        case "9": result += 9 * 3; break;
                        case "10": result += 10 * 3; break;
                        case "J": result += 11 * 3; break;
                        case "Q": result += 12 * 3; break;
                        case "K": result += 13 * 3; break;
                        case "A": result += 14 * 3;break;
                    }
                    break;
                case "D":
                    switch (power){
                        case "2": result += 2 * 2; break;
                        case "3": result += 3 * 2; break;
                        case "4": result += 4 * 2; break;
                        case "5": result += 5 * 2; break;
                        case "6": result += 6 * 2; break;
                        case "7": result += 7 * 2; break;
                        case "8": result += 8 * 2; break;
                        case "9": result += 9 * 2; break;
                        case "10": result += 10 * 2; break;
                        case "J": result += 11 * 2; break;
                        case "Q": result += 12 * 2; break;
                        case "K": result += 13 * 2; break;
                        case "A": result += 14 * 2;break;
                    }
                    break;
                case "C":
                    switch (power){
                        case "2": result += 2 ; break;
                        case "3": result += 3 ; break;
                        case "4": result += 4; break;
                        case "5": result += 5 ; break;
                        case "6": result += 6; break;
                        case "7": result += 7 ; break;
                        case "8": result += 8 ; break;
                        case "9": result += 9 ; break;
                        case "10": result += 10; break;
                        case "J": result += 11; break;
                        case "Q": result += 12; break;
                        case "K": result += 13; break;
                        case "A": result += 14;break;
                    }
                    break;
            }

        }

        return result;

    }
}
