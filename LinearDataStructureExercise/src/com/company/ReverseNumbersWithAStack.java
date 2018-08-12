package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a))
                .boxed().collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            stack.push(numbers.get(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.poll() + " ");
        }

    }
}
