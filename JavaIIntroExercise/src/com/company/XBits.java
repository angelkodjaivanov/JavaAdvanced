package com.company;

import java.util.Scanner;
public class XBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0; i <= 7; i++){
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for(int i = 0; i <=5; i++){
            for(int pos = 0; pos <= 5; pos++){
                int mask1 = arr[i] >> pos;
                int bit1 = mask1 & 1;
                int mask2 = arr[i] >> pos + 1;
                int bit2 = mask2 & 1;
                int mask3 = arr[i] >> pos + 2;
                int bit3 = mask3 & 1;
                int mask4 = arr[i + 1] >> pos;
                int bit4 = mask4 & 1;
                int mask5 = arr[i + 1] >> pos + 1;
                int bit5 = mask5 & 1;
                int mask6 = arr[i + 1] >> pos + 2;
                int bit6 = mask6 & 1;
                int mask7 = arr[i + 2] >> pos;
                int bit7 = mask7 & 1;
                int mask8 = arr[i + 2] >> pos + 1;
                int bit8 = mask8 & 1;
                int mask9 = arr[i + 2] >> pos + 2;
                int bit9 = mask9 & 1;
                if(bit1 == 1 && bit2 == 0 && bit3 == 1
                        && bit4 == 0 && bit5 == 1 && bit6 == 0
                        && bit7 == 1 && bit8 == 0 && bit9 == 1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
