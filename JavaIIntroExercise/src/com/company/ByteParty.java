package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < count; i++){
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }

        String line = scanner.nextLine();
        while(!line.equals("party over")){

            List<Integer> props = Arrays.stream(line.split(" ")).
                    mapToInt(a -> Integer.parseInt(a)).boxed().collect(Collectors.toList());

            int position = 0;
            switch(props.get(0)){
                case -1:
                    position = props.get(1);
                    for(int i = 0 ; i < numbers.size(); i++){
                        String binary = Integer.toBinaryString(numbers.get(i));
                        if(String.format("%8s", binary).replace(" ", "0").charAt(7 - position) == '0'){
                            int mask = 1 << position;
                            numbers.set(i, numbers.get(i) | mask);
                        }
                        else{
                            int mask = ~(1 << position);
                            numbers.set(i, numbers.get(i) & mask);
                        }
                    }

                    break;
                case 0:
                    position = props.get(1);
                    for(int i = 0 ; i < numbers.size(); i++){
                        int mask = ~(1 << position);
                        int num = numbers.get(i) & mask;
                        numbers.set(i, num);
                    }
                    break;
                case 1:
                    position = props.get(1);
                    for(int i = 0 ; i < numbers.size(); i++){
                        int mask = 1 << position;
                        numbers.set(i, numbers.get(i) | mask);
                    }
                    break;
            }

            line = scanner.nextLine();
        }


        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
