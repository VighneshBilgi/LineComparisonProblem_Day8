package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;

class Point {
    static int x1 = 0, y1 = 0,x2 = 0,y2 =0, x3= 0, y3 =0, x4 = 0 , y4 = 0;

    public static void getPoints(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end point co-ordinates for the Line 1:");
        System.out.println("Enter X1 value is :");
        x1 = sc.nextInt();

        System.out.println("Enter Y1 value is :");
         y1 = sc.nextInt();

        System.out.println("Enter X2 value is :");
         x2 = sc.nextInt();

        System.out.println("Enter Y2 value is :");
         y2 = sc.nextInt();

        System.out.println("Enter end point co-ordinates for Line 2:");
        System.out.println("Enter X3 value is :");
         x3 = sc.nextInt();

        System.out.println("Enter Y3 value is :");
         y3 = sc.nextInt();

        System.out.println("Enter X4 value is :");
         x4 = sc.nextInt();

        System.out.println("Enter Y4 value is :");
         y4 = sc.nextInt();

    }

}

class Line extends Point{
    static double length1 = 0.0, length2 = 0.0;

    public static void calculateLine(){
        length1 = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        length2 = Math.sqrt((Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));

        System.out.println("Length of Line 1 is: " + length1);
        System.out.println("Length of Line 2 is: " + length2);
    }

    public static void lineEquality(){
        if( (Double.toString(length1) ).equals( Double.toString(length2) ) == true){
            System.out.println("The Lines are equal");
        }
        else{
            System.out.println("The Lines are NOT equal");
        }
    }

    public static void lineComparison(){
         int compare_to =  (Double.toString(length1) ).compareTo( Double.toString(length2) );
//      "compare_to" variable holds the integer value outputted by .compareTo() method.
//      If compare_to is -ve , then Line 1 is smaller ,
//      else if compare_to is +ve , then Line 1 is larger
//      else Line 1 is equal to Line
        if(compare_to <0){
            System.out.println("Line 1 is LESSER than Line 2");
        } else if (compare_to >0) {
            System.out.println("Line 1 is GREATER than Line 2");
        }
        else {
            System.out.println("Line 1 is EQUAL to Line 2");
        }
    }

}

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Point point = new Point();
        point.getPoints();

        Line line = new Line();
        line.calculateLine();
        line.lineEquality();
        line.lineComparison();

    }

}
