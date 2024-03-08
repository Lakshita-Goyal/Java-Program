// Java program to find the sum of a Series 1/1! + 2/2! + 3/3! + 4/4! +…….+ n/n!

import java.io.*;
import java.lang.*;
 
class Series1 {
    public static double sumOfSeries(double num)
    {
        double res = 0, fact = 1;
        for (int i = 1; i <= num; i++) 
        {
            /*fact variable store factorial of the i.*/
            fact = fact * i;
 
            res = res + (i / fact);
        }
        return (res);
    }
 
    public static void main(String[] args)
    {
        double n = 6;
        System.out.println("Sum: " + sumOfSeries(n));
    }
}
 
