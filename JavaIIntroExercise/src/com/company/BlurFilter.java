package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int blurAmount = Integer.parseInt(scanner.nextLine());
        int[] sizeProps = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a)).toArray();
        int height = sizeProps[0];
        int width = sizeProps[1];

        long[][] arr = new long[height][width];

        for (int i = 0; i < height; i++) {
            long[] values = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(a -> Long.parseLong(a)).toArray();
            arr[i] = values;
        }

        int[] pointProps = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a)).toArray();
        int x = pointProps[0];
        int y = pointProps[1];

        if(x > 0) {
            if(y > 0) {
                arr[x - 1][y - 1] += blurAmount;
            }
            arr[x - 1][y] += blurAmount;
            if(y < width - 1) {
                arr[x - 1][y + 1] += blurAmount;
            }
        }
        if(y > 0) {
            arr[x][y - 1] += blurAmount;
        }
        arr[x][y] += blurAmount;
        if(y < width - 1) {
            arr[x][y + 1] += blurAmount;
        }
        if(x < height - 1) {
            if(y > 0) {
                arr[x + 1][y - 1] += blurAmount;
            }
            arr[x + 1][y] += blurAmount;
            if(y < width - 1) {
                arr[x + 1][y + 1] += blurAmount;
            }
        }


        for (int i = 0; i < height ; i++) {
            for(int j = 0; j < width; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
