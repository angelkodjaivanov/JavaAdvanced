package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class HothPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int count = scanner.nextInt();

        Deque<String> queue = new ArrayDeque<>();
        for(int i = 0; i < names.length; i++){
            queue.offer(names[i]);
        }

        while(queue.size() > 1){
            for(int i = 0; i < count - 1; i++){
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}
