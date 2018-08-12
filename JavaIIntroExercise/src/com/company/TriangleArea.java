package com.company;

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Ax = scanner.nextDouble();
        double Ay = scanner.nextDouble();
        double Bx = scanner.nextDouble();
        double By = scanner.nextDouble();
        double Cx = scanner.nextDouble();
        double Cy = scanner.nextDouble();
        double result = Math.abs((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2);
        if (result == 0.0){
            System.out.println(0);
        }
        else {
            System.out.println((int)result);
        }
    }
}
