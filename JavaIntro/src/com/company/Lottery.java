package com.company;

public class Lottery {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = i + 1; j <= 10; j++){
                for (int k = j + 1; k <= 10; k++){
                    System.out.printf("%d %d %d%n", i, j ,k);
                }
            }
        }
    }
}
