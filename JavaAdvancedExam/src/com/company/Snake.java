package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Snake {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        String[] commands = bf.readLine().split(", ");
        char[][] map = new char[size][size];

        int snakeX = 0;
        int snakeY = 0;
        for (int i = 0; i < size; i++) {
            String[] inputArgs = bf.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                map[i][j] = inputArgs[j].charAt(0);
                if(map[i][j] == 's'){
                    snakeX = j;
                    snakeY = i;
                }
            }
        }

        long length = 1;
        boolean gameOver = false;
        for (String command:commands) {
            switch (command){
                case "left":
                    if(snakeX - 1 < 0){
                        snakeX = size - 1;
                    }
                    else{
                        snakeX--;
                    }

                    if(map[snakeY][snakeX] == 'f'){
                        map[snakeY][snakeX] = '*';
                        length++;
                    }
                    else if(map[snakeY][snakeX] == ('e')){
                        gameOver = true;
                    }
                    break;
                case "right":
                    if(snakeX + 1 == size){
                        snakeX = 0;
                    }
                    else{
                        snakeX++;
                    }

                    if(map[snakeY][snakeX] == ('f')){
                        map[snakeY][snakeX] = '*';
                        length++;
                    }
                    else if(map[snakeY][snakeX] == ('e')){
                        gameOver = true;
                    }
                    break;
                case "up":
                    if(snakeY - 1 < 0){
                        snakeY = size - 1;
                    }
                    else{
                        snakeY--;
                    }

                    if(map[snakeY][snakeX] == ('f')){
                        map[snakeY][snakeX] = '*';
                        length++;
                    }
                    else if(map[snakeY][snakeX] == ('e')){
                        gameOver = true;
                    }
                    break;
                case "down":
                    if(snakeY + 1 == size){
                        snakeY = 0;
                    }
                    else{
                        snakeY++;
                    }

                    if(map[snakeY][snakeX] == ('f')){
                        map[snakeY][snakeX] = '*';
                        length++;
                    }
                    else if(map[snakeY][snakeX] == ('e')){
                        gameOver = true;
                    }
                    break;
            }

            if(gameOver){
                break;
            }
        }

        boolean leftApples = false;
        long leftFood = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(map[i][j] == 'f'){
                    leftApples = true;
                    leftFood++;
                }
            }
        }


        if(leftApples){
            if(gameOver){
                System.out.println("You lose! Killed by an enemy!");
            }
            else {
                System.out.println("You lose! There is still " + leftFood + " food to be eaten.");
            }
        }
        else{
            System.out.println("You win! Final snake length is " + length);
        }

    }
}
