package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class basicStackOperations {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int[] inputArgs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a)).toArray();
    }
}
