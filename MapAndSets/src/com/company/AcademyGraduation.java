package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Double> map = new TreeMap<>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            double[] results = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(a -> Double.parseDouble(a)).toArray();
            double result = average(results);
            map.put(name, result);
        }

        for (String key:map.keySet()) {
            System.out.println(key + " is graduated with " + map.get(key));
        }

    }

    private static double average(double[] results) {
        double result = 0;
        for (int i = 0; i < results.length; i++) {
            result += results[i];
        }
        return result / results.length;
    }

}
