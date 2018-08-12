package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = Integer.parseInt(scanner.nextLine());
	    String[] names = new String[n];

	    for(int i = 0; i < n; i++){
	        names[i] = scanner.nextLine();
        }

        for(int i = 0; i < n; i++){
            for(int j = names.length - 1; j > i; j--){
                int rightNameScore = 0;
                int leftNameScore = 0;
                for(int k = 0; k < names[j].length(); k++){
                    if(names[j].toLowerCase().charAt(k) == 'a' || names[j].toLowerCase().charAt(k) == 'e' || names[j].toLowerCase().charAt(k) == 'i' ||
                         names[j].toLowerCase().charAt(k) == 'o' || names[j].toLowerCase().charAt(k) == 'u'){
                        rightNameScore += names[j].charAt(k) * names[j].length();
                    }
                    else{
                        rightNameScore += names[j].charAt(k) / names[j].length();
                    }
                }

                for(int k = 0; k < names[j - 1].length(); k++){
                    if(names[j - 1].toLowerCase().charAt(k) == 'a' || names[j - 1].toLowerCase().charAt(k) == 'e'
                            || names[j - 1].toLowerCase().charAt(k) == 'i' ||
                            names[j - 1].toLowerCase().charAt(k) == 'o' || names[j - 1].toLowerCase().charAt(k) == 'u'){
                        leftNameScore += names[j - 1].charAt(k) * names[j - 1].length();
                    }
                    else{
                        leftNameScore += names[j - 1].charAt(k) / names[j - 1].length();
                    }
                }

                if(leftNameScore > rightNameScore){
                    String swap = names[j];
                    names[j] = names[j - 1];
                    names[j - 1] = swap;
                }

                if(j == i + 1){
                    if(leftNameScore > rightNameScore){
                        System.out.println(rightNameScore);
                        if(i == n - 2){
                            System.out.println(leftNameScore);
                        }
                    }
                    else{
                        System.out.println(leftNameScore);
                        if(i == n - 2){
                            System.out.println(rightNameScore);
                        }
                    }
                }
            }
        }



    }
}
