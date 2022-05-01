package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter end point co-ordinates for the Line:");
        System.out.println("Enter X1 value is :");
        int x1 = sc.nextInt();

        System.out.println("Enter Y1 value is :");
        int y1 = sc.nextInt();

        System.out.println("Enter X2 value is :");
        int x2 = sc.nextInt();

        System.out.println("Enter Y2 value is :");
        int y2 = sc.nextInt();

        double length = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));

        System.out.println("Length of Line is: " + length);
    }

}
