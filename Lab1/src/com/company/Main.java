package com.company;

/**
 * Lab 1
 * @author: irfanyusra
 */

import static java.lang.Math.abs;
import java.util.Scanner;

public class Main {
    public static int S[]={1, 5, 10, 20, 25};

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Recursion ");
	    System.out.println("--Newton Square Root--");
	    System.out.println("Enter a value to calculate the square root: ");
        double x = reader.nextDouble(); // Scans the next token of the input as an double.
	    double a = x/2;
	    double eps = 1E-6;
	    double ans = newtonSqrt( x,  a,  eps);
	    System.out.println(ans);

        System.out.println("--Coin Change--");
        System.out.println("Enter a change value: ");
        int c = reader.nextInt();
        int min = findMinChangeCoins (c, 0);
        System.out.println(min);

    }
//understand it better
    public static int findMinChangeCoins(int C, int n){
        if (C == 0)
            return 1;
        if (C < 0)
            return 0;

       /* int combo=0;
        int minCombo = 0;
        for (int coin = n; coin < S.length; coin++){
            combo+= findMinChangeCoins (C - S[coin], coin);
        }
        return combo;*/
        // Initialize result
        int res=Integer.MAX_VALUE;

        // Try every coin that has smaller value than C
        for (int i=0; i<S.length ; i++)
        {
            if (S[i] <= C)
            {
                int temp = findMinChangeCoins( C- S[i], S.length);

                // see if result can minimized
                if (temp + 1 < res)
                    res = temp + 1;
            }
        }
        return res;
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
