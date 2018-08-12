package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(number -> Integer.parseInt(number)).toArray();
        System.out.println(findMinElement.apply(numbers));
    }

    private static Function<int[],Integer> findMinElement = new Function<int[],Integer>(){
        public Integer apply(int [] array){
            int minimum = array[0];
            for(Integer num : array){
                if(minimum>num){
                    minimum=num;
                }
            }
            return minimum;
        }
    };
}
