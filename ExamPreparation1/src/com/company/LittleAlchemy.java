package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class LittleAlchemy {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int anArr : arr) {
            deque.offer(anArr);
        }

        String line = bf.readLine();
        int quantity = 0;
        while(!"Revision".equals(line)){

            String[] inputArgs = line.split(" ");
            String command = inputArgs[0];
            int count = Integer.parseInt(inputArgs[2]);

            if("Apply".equals(command)) {
                for (int i = 0; i < count; i++) {
                    if (!deque.isEmpty()) {
                        int number = deque.remove();
                        number--;
                        if (number == 0) {
                            quantity++;
                        } else {
                            deque.add(number);
                        }
                    }
                }
            }
            else {
                if(quantity > 0) {
                    deque.add(count);
                    quantity--;
                }
            }
            line = bf.readLine();
        }

        int size = deque.size();
        for (int i = 0; i < size ; i++) {
            System.out.print(deque.poll() + " ");
        }
        System.out.println();
        System.out.println(quantity);

    }
}
