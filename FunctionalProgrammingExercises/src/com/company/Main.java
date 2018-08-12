package com.company;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Consumer<String> consumer = word -> System.out.println(word);
        for (String word:words) {
            consumer.accept(word);
        }
    }
}
