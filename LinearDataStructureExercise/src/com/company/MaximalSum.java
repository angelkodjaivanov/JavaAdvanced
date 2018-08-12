package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(a -> Integer.parseInt(a)).toArray();

        int n = matrixSize[0];
        int m = matrixSize[1];

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            arr[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(a -> Integer.parseInt(a)).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < m - 2; j++){
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if(sum > maxSum){
                    maxSum = sum;
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        System.out.println(arr[x][y] + " " + arr[x][y + 1] + " " + arr[x][y + 2]);
        System.out.println(arr[x + 1][y] + " " + arr[x + 1][y + 1] + " " + arr[x + 1][y + 2]);
        System.out.println(arr[x + 2][y] + " " + arr[x + 2][y + 1] + " " + arr[x + 2][y + 2]);
    }
}
