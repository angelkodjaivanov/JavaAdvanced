package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class MaximumSumOf2x2Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(a -> Integer.parseInt(a)).toArray();

        int n = matrixSize[0];
        int m = matrixSize[1];

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            arr[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(a -> Integer.parseInt(a)).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < m - 1; j++){
                int sum = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                if(sum > maxSum){
                    maxSum = sum;
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(arr[x][y] + " " + arr[x][y + 1]);
        System.out.println(arr[x + 1][y] + " " + arr[x + 1][y + 1]);
        System.out.println(maxSum);
    }
}
