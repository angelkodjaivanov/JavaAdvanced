package com.company;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Scanner;
public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixProps = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixProps[0]);
        int columns = Integer.parseInt(matrixProps[1]);

        String[][] arr = new String[rows][columns];

        for(int i = 0; i < rows; i++){
            arr[i] = scanner.nextLine().split(" ");
        }

        String line = scanner.nextLine();

        while(!line.equals("END")){

            String[] inputArgs = line.split(" ");

            if(isValid(inputArgs, rows, columns)){
                swap(arr, inputArgs);
                printArray(arr, rows);
            }
            else{
                System.out.println("Invalid input!");
            }

            line = scanner.nextLine();
        }

    }

    private static void printArray(String[][] arr, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println(String.join(" ", arr[i]));
        }
    }

    private static void swap(String[][] arr, String[] inputArgs) {
        int firstRow = Integer.parseInt(inputArgs[1]);
        int firsColumn = Integer.parseInt(inputArgs[2]);
        int secondRow = Integer.parseInt(inputArgs[3]);
        int secondColumn = Integer.parseInt(inputArgs[4]);

        String swap = arr[firstRow][firsColumn];
        arr[firstRow][firsColumn] = arr[secondRow][secondColumn];
        arr[secondRow][secondColumn] = swap;

    }

    private static boolean isValid(String[] inputArgs, int rows, int columns) {
        if(inputArgs.length != 5){
            return false;
        }
        else if(!inputArgs[0].equals("swap")){
            return false;
        }
        else if(Integer.parseInt(inputArgs[1]) >= rows || Integer.parseInt(inputArgs[2]) >= columns
                || Integer.parseInt(inputArgs[3]) >= rows || Integer.parseInt(inputArgs[4]) >= columns ){
            return false;
        }
        return true;
    }
}
