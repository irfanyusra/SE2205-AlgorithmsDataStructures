package com.company;

/**
 * Lab 1
 * @author: irfanyusra
 */

import static java.lang.Math.abs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Recursion ");
	    System.out.println("--Newton Square Root--");
	    System.out.println("Enter a value to calculate the square root: ");
        System.out.println("Enter a number: ");
        double x = reader.nextDouble(); // Scans the next token of the input as an double.
	    double a = x/2;
	    double eps = 1E-6;
	    double ans = newtonSqrt( x,  a,  eps);
	    System.out.print(ans);

    }

    public static double newtonSqrt(double x, double a, double eps){
       double y = abs (a*a-x);
       if (y<eps)
           return a;
       else {
           a = (a + x / a) / 2;
           return newtonSqrt(x, a, eps);
       }
    }
}
