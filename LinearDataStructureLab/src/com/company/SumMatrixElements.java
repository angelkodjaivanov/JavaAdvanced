package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class SumMatrixElements {
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

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                sum += arr[i][j];
            }
        }

        System.out.println(n);
        System.out.println(m);
        System.out.println(sum);

    }
}
