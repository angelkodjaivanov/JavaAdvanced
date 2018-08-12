package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String[] inputArgs = scanner.nextLine().split(", ");
	    int size = Integer.parseInt(inputArgs[0]);
	    String method = inputArgs[1];

	    int[][] arr = new int[size][size];
	    if(method.equals("A")){
	        arr = methodA(size);
        }
        else if(method.equals("B")){
            arr = methodB(size);
        }

        printArr(arr, size);
    }

    private static void printArr(int[][] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] methodA(int size) {
        int[][] arr = new int[size][size];

        int number = 1;
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++){
                arr[j][i] = number;
                number++;
            }
        }

        return arr;
    }

    private static int[][] methodB(int size) {
        int[][] arr = new int[size][size];

        int number = 1;
        for (int i = 0; i < size; i++) {
            if(i % 2 == 1){
                for (int j = size - 1; j >= 0; j--) {
                    arr[j][i] = number;
                    number++;
                }
            }
            else {
                for (int j = 0; j < size; j++) {
                    arr[j][i] = number;
                    number++;
                }
            }
        }

        return arr;
    }
}
