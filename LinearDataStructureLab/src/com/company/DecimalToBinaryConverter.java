package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        if(number == 0){
            System.out.println(0);
        }
        else{
            while(number != 0){
                int dig = number % 2;
                stack.push(dig);
                number /= 2;
            }

            while(!stack.isEmpty()){
                System.out.print(stack.pop());
            }
        }

    }
}
