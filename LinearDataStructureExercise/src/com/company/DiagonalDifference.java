package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            List<String> input  = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            input.removeIf(item -> item == null || "".equals(item));
            arr[i] = input.stream().mapToInt(a -> Integer.parseInt(a)).toArray();
        }

        int sumMD = sumMainDiagonal(arr, size);
        int sumSD = sumSecondaryDiagonal(arr, size);
        System.out.println(Math.abs(sumMD - sumSD));
    }

    private static int sumSecondaryDiagonal(int[][] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[size - i - 1][i];
        }
        return sum;
    }

    private static int sumMainDiagonal(int[][] arr, int size) {
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += arr[i][i];
        }
        return sum;
    }

}
