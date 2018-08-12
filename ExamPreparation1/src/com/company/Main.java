package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputSize = scanner.nextLine().split(" ");
        int height = Integer.parseInt(inputSize[0]);
        int width = Integer.parseInt(inputSize[1]);
        int[][] arr = new int[height][width];
        String line = scanner.nextLine();
        while (!"Here We Go".equals(line)){

            String[] pointArgs = line.split(" ");
            int X1 = Integer.parseInt(pointArgs[0]);
            int Y1 = Integer.parseInt(pointArgs[1]);
            int X2 = Integer.parseInt(pointArgs[2]);
            int Y2 = Integer.parseInt(pointArgs[3]);

            for (int i = X1; i <= X2; i++) {
                for (int j = Y1; j <= Y2; j++) {
                    arr[i][j]++;
                }
            }

            line = scanner.nextLine();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
