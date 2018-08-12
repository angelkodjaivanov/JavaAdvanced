package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int count = scanner.nextInt();

        Deque<String> queue = new ArrayDeque<>();
        for(int i = 0; i < names.length; i++){
            queue.offer(names[i]);
        }

        int cycle = 1;
        while(queue.size() > 1){
            for(int i = 0; i < count - 1; i++){
                queue.offer(queue.poll());
            }
            if(isPrime(cycle) && cycle > 1) {
                System.out.println("Prime " + queue.peek());
            }
            else{
                System.out.println("Removed " + queue.poll());
            }

            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int cycle) {
        boolean isPrime = true;
        for(int i = 2; i < cycle; i++){
            if(cycle % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
