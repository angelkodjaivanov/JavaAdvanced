package com.company;


import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num_1 = scanner.nextLine();
        String num_2 = scanner.nextLine();
        StringBuilder result = sum(num_1, num_2);
        while(result.toString().startsWith("0")){
            result.deleteCharAt(0);
        }
        System.out.println(result);
    }

    private static StringBuilder sum(String num_1, String num_2) {
        StringBuilder result = new StringBuilder("");

        if(num_1.length() > num_2.length()){
            StringBuilder number_2 = (new StringBuilder(num_2).reverse().
                    append(concat('0', num_1.length() - num_2.length()))).reverse();
            num_2 = number_2.toString();
        }
        else{
            StringBuilder number_1 = (new StringBuilder(num_1).reverse().
                    append(concat('0', num_2.length() - num_1.length()))).reverse();
            num_1 = number_1.toString();
        }

        int res = 0;
        for (int i = 1; i <= Math.min(num_1.length(), num_2.length()) ; i++) {
            int dig_1 = Integer.parseInt(num_1.substring(num_1.length() - i, num_1.length() - i + 1));
            int dig_2 = Integer.parseInt(num_2.substring(num_2.length() - i, num_2.length() - i + 1));
            int number = dig_1 + dig_2 + res;
            StringBuilder n = new StringBuilder(number + "");
            if(n.length() == 2) {
                char addDig = n.charAt(1);
                res = n.charAt(0) - 48;
                result.append(addDig);
            }
            else{
                char addDig = n.charAt(0);
                res = 0;
                result.append(addDig);
            }
        }

        if(res > 0){
            result.append(res);
        }

        return result.reverse();
    }

    private static String concat(char c, int count) {
        StringBuilder sb = new StringBuilder("");
        for (int j = 0; j < count; j++) {
            sb.append(c);
        }
        return sb.toString();
    }


}
