package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArgs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a)).toArray();
        int rows = inputArgs[0];
        int columns = inputArgs[1];
        String[][] arr = new String[rows][columns];

        arr = fillArray(rows, columns);
        printArray(arr, rows);
    }

    private static void printArray(String[][] arr, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println(String.join(" ", arr[i]));
        }
    }

    private static String[][] fillArray(int rows, int columns) {
        String[][] arr = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                String text = "" + (char)(i + 97) + (char)(i + j + 97) + (char)(i + 97);
                arr[i][j] = text;
            }
        }
        return arr;
    }
}
