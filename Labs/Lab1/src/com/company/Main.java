package com.company;

/**
 * Lab 1
 * @author: irfanyusra
 */

import static java.lang.Math.abs;
import java.util.Scanner;

public class Main {
	public static int S[] = { 1, 5, 10, 20, 25};
	static int[] denominations = {1,5,10,20,25};

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Recursion ");
		System.out.println("--Newton Square Root--");
		System.out.println("Enter a value to calculate the square root: ");
		double x = reader.nextDouble(); // Scans the next token of the input as an
		 double a = x / 2;
		 double eps = 1E-6;
		 double ans = newtonSqrt(x, a, eps);
		 System.out.println(ans);

		System.out.println("--Coin Change--");
		System.out.println("Enter a change value: ");
		int c = reader.nextInt();
		// System.out.println("MY CODE Minimum coins required is "+ minCoins(  c, S.length) ); 
	    System.out.println("Minimum coins required is "+ minCoins( S.length, c) ); 

	}


	
	
	
	
	
	 static int minCoins(int m, int V) 
	    { 
	       // base case 
	       if (V == 0) return 0; 
	       
	       // Initialize result 
	       int res = Integer.MAX_VALUE; 
	       
	       // Try every coin that has smaller value than V 
	       for (int i=m-1; i>=0; i--) 
	       { 
	         if (S[i] <= V) 
	         { 
	             int sub_res = minCoins( m, V-S[i]); 
	       
	             // Check for INT_MAX to avoid overflow and see if 
	             // result can minimized 
	             if ( sub_res + 1 < res) 
	                res = sub_res + 1; 
	         } 
	       } 
	       return res; 
	    } 

	
	
	public static double newtonSqrt(double x, double a, double eps) {
		double y = abs(a * a - x);
		if (y < eps)
			return a;
		else {
			a = (a + x / a) / 2;
			return newtonSqrt(x, a, eps);
		}
	}

}
