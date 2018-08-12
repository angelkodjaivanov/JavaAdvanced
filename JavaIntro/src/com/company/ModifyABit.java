package com.company;

import java.util.Scanner;
public class ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number = scanner.nextInt();
        Integer position = scanner.nextInt();
        Integer bit = scanner.nextInt();

        if(bit == 1){
            int mask = bit << position;
            int result = number | mask;
            System.out.println(result);
        }
        else if(bit == 0){
            int mask = ~(1 << position);
            int result = number & mask;
            System.out.println(result);
        }

    }
}
