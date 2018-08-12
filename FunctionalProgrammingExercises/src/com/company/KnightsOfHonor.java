package com.company;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Consumer<String> consumer = word -> System.out.println("Sir " + word);
        for (String word:words) {
            consumer.accept(word);
        }
    }
}
