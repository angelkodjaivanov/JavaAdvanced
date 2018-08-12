package com.company;

import java.util.Scanner;
public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        Integer num_1 = scanner.nextInt();
        Integer num_2 = scanner.nextInt();
        Integer num_3 = scanner.nextInt();
        scanner.nextLine();
        String thirdWord = scanner.nextLine();

        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + (num_1 + num_2 + num_3));

    }
}
